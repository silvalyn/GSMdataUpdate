package com.example.gsmdata;



        import com.google.firebase.database.IgnoreExtraProperties;

// [START comment_class]
        @IgnoreExtraProperties
        public class Comment {

        public String Humidity;
        public String Temperature;
        public String GPD;
        public String gabagelevel;


    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
        }

    public Comment(String humidity, String temperature, String GPD, String gabagelevel) {
        Humidity = humidity;
        Temperature = temperature;
        this.GPD = GPD;
        this.gabagelevel = gabagelevel;
    }
}

