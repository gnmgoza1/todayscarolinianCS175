package com.example.chatbox;

import java.util.ArrayList;
import java.util.Random;

import android.app.ActionBar;
import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.todays.R;

public class ChatActivity extends ListActivity {
	/** Called when the activity is first created. */

	ArrayList<Message> messages;
	MessageAdapter adapter;
	EditText text;
	static Random rand = new Random();
	static String sender;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sms_main);

		ActionBar actionBar = getActionBar();
		actionBar.setTitle("TODAY'S CAROLINIAN");
		actionBar.setSubtitle("Our commitment. Your paper.");

		actionBar.setDisplayHomeAsUpEnabled(true);

		text = (EditText) this.findViewById(R.id.edit);

		sender = ChatItem.sender[rand.nextInt(ChatItem.sender.length - 1)];
		this.setTitle(sender);
		messages = new ArrayList<Message>();

		messages.add(new Message("Hello! :>", true));
		messages.add(new Message("Hey there, Fellow Carolinian!", false));
		messages.add(new Message(
				"May I ask something regarding about the Uniform Exception this week?",
				true));
		messages.add(new Message("Yeah, Sure. What is it?", false));
		messages.add(new Message(
				"Can I wear something like stripes? I swear the dominant color is pink",
				true));

		adapter = new MessageAdapter(this, messages);
		setListAdapter(adapter);
		addNewMessage(new Message(
				"Sure you can as long as it fits the theme for this week.",
				false));
	}

	public void sendMessage(View v) {
		String newMessage = text.getText().toString().trim();
		if (newMessage.length() > 0) {
			text.setText("");
			addNewMessage(new Message(newMessage, true));
			new SendMessage().execute();
		}
	}

	private class SendMessage extends AsyncTask<Void, String, String> {
		@Override
		protected String doInBackground(Void... params) {
			try {
				Thread.sleep(2000); // simulate a network call
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			this.publishProgress(String.format("%s started writing", sender));
			try {
				Thread.sleep(2000); // simulate a network call
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.publishProgress(String.format("%s has entered text", sender));
			try {
				Thread.sleep(3000);// simulate a network call
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			return ChatItem.messages[rand.nextInt(ChatItem.messages.length - 1)];

		}

		@Override
		public void onProgressUpdate(String... v) {

			if (messages.get(messages.size() - 1).isStatusMessage)// check
																	// wether we
																	// have
																	// already
																	// added a
																	// status
																	// message
			{
				messages.get(messages.size() - 1).setMessage(v[0]); // update
																	// the
																	// status
																	// for that
				adapter.notifyDataSetChanged();
				getListView().setSelection(messages.size() - 1);
			} else {
				addNewMessage(new Message(true, v[0])); // add new message, if
														// there is no existing
														// status message
			}
		}

		@Override
		protected void onPostExecute(String text) {
			if (messages.get(messages.size() - 1).isStatusMessage)// check if
																	// there is
																	// any
																	// status
																	// message,
																	// now
																	// remove
																	// it.
			{
				messages.remove(messages.size() - 1);
			}

			addNewMessage(new Message(text, false)); // add the orignal message
														// from server.
		}

	}

	void addNewMessage(Message m) {
		messages.add(m);
		adapter.notifyDataSetChanged();
		getListView().setSelection(messages.size() - 1);
	}
}