/*
 * 
 * 
 */
package com.incept.bean;

import com.incept.websockets.NotificationEndPoint;
import com.incept.websockets.ThreadMsgSender;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
/**
 *
 * @author bhalepr
 */
@Named
@ViewScoped
public class NotificationManagedBean implements Serializable{

  /**
   * Creates a new instance of NotificationManagedBean
   */
  public NotificationManagedBean() {
  }
  
  String message;
  
  public void sendNotification()  {
    System.out.println("Sending Message: " + message);
    ThreadMsgSender.sendMessage(message);
  }
  
  public List getNotificationReceiverList() {
    return NotificationEndPoint.getSessions();
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  
  
}
