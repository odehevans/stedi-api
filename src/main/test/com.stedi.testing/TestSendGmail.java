package com.stedi.testing;

import com.getsimplex.steptimer.utils.SendGmail;

public class TestSendGmail {
 public static void main (String[] args) {
     SendGmail.send("unidgreat@gmail.com", "Hello, this is a test", "Testing","Evans");
 }
}
