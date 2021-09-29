package com.strongmore.dujitangplugin.model;

public class TauntResponse {

  private String status;
  private String msg;
  private TauntInfo data;
  private Long timestamp;

  public void setStatus(String status) {
    this.status = status;
  }

  public void setData(TauntInfo data) {
    this.data = data;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public String getMsg() {
    return msg;
  }

  public String getStatus() {
    return status;
  }

  public TauntInfo getData() {
    return data;
  }

  public boolean isSuccess() {
    return "1".equals(status);
  }
}
