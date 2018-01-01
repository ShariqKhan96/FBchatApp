package com.example.shariqkhan.fbchatapp;

import java.util.Date;

/**
 * Created by ShariqKhan on 12/30/2017.
 */

public class ChatMessage {

        private String messageText;


        public ChatMessage(String messageText) {
            this.messageText = messageText;

        }

        public ChatMessage() {
        }


    public String getMessageText() {
            return messageText;
        }

//        public void setMessageText(String messageText) {
//            this.messageText = messageText;
//        }


//        public void setMessageUser(String messageUser) {
//            this.messageUser = messageUser;
//        }

//
//        public void setMessageTime(long messageTime) {
//            this.messageTime = messageTime;
//        }
    }
