package com.spring.dataConnection;

public class FeedBack {
   private int id;
   private String description;
   private String rating;
   public int getId() {
    return id;
   }
   public void setId(int id) {
    this.id = id;
   }
   public String getDescription() {
    return description;
   }
   public void setDescription(String description) {
    this.description = description;
   }
   public String getRating() {
    return rating;
   }
   public void setRating(String rating) {
    this.rating = rating;
   }
   public FeedBack(int id, String description, String rating) {
    this.id = id;
    this.description = description;
    this.rating = rating;
   }

   public FeedBack(){}
   @Override
   public String toString() {
    return "FeedBack [id=" + id + ", description=" + description + ", rating=" + rating + "]";
   };

   
   public static void main(String[] args) {
       System.out.println("Prasannnas");
   }

}
