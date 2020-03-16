package com.ethiopia.app.jokes.Fragments;

/**
 * Created by tibsolg on 2/21/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ethiopia.app.jokes.R;
import com.ethiopia.app.jokes.Recycler.Jokes;
import com.ethiopia.app.jokes.Recycler.MyRecyclerAdapter;

import java.util.ArrayList;

/**
 * Created by tibsolg on 2/21/2017.
 */
public class Eng_School_Jokes extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.eng_school_jok, null);
        RecyclerView rv=(RecyclerView)v.findViewById(R.id.mRecyclerSchool);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getSchoolJokes()));

        return v;
    }

    private ArrayList<Jokes> getSchoolJokes() {
        ArrayList<Jokes>joke=new ArrayList<>();
        Jokes jokes=new Jokes("rockabillyray","A teacher is teaching a class and she sees that Johnny isnt paying attention, so she asks him, If there are three ducks sitting on a fence, and you shoot one, how many are left? Johnny says, None. The teacher asks, Why? Johnny says, Because the shot scared them all off. The teacher says, No, two, but I like how you are thinking. Johnny asks the teacher, If you see three women walking out of an ice cream parlor, one is licking her ice cream, ");
        joke.add(jokes);

        jokes=new Jokes("Ms bontoft :)","Teacher: \"Why are you so late?\"\n" +
                "Student: \"Someone told me to go to hell.\"\n" +
                "Teacher: \"Why did that make you late to class?\"\n" +
                "Student: \"I couldn't find it at first, but now here I am.\" ");
        joke.add(jokes);

        jokes=new Jokes("Anonymous","On the first day of school, the teacher asked a student, \"What are your parents' names?\" The student replied, \"My father's name is Laughing and my mother's name is Smiling.\" The teacher said, \"Are you kidding?\" The student said, \"No, Kidding is my brother. I am Joking.\" ");
        joke.add(jokes);

        jokes=new Jokes("Anonymous","Teacher: \"Answer this math problem: if your father earns $500 a week and gives half to your mother. What will he have?\"\n" +
                "Student: \"A heart attack.\" ");
        joke.add(jokes);

        jokes=new Jokes("HARSHANGI","eacher: \"Jill, where is the America on the map?\"\n" +
                "Jill: \"Right there, ma'am.\"\n" +
                "Teacher: \"Correct. Now, Jack, tell me who found America.\"\n" +
                "Jack: \"Jill.\" ");
        joke.add(jokes);

        jokes=new Jokes("Anonymous","Dad: \"Can I see your report card, son?\"\n" +
                "Son: \"I don't have it.\"\n" +
                "Dad: \"Why?\"\n" +
                "Son: \"I gave it to my friend. He wanted to scare his parents.\" ");
        joke.add(jokes);

        jokes=new Jokes("Darkrose300","A bank robber pulls out gun points it at the teller, and says, \"Give me all the money or you're geography!\" The puzzled teller replies, \"Did you mean to say 'or you're history?'\" The robber says, \"Don't change the subject!\" ");
        joke.add(jokes);

        jokes=new Jokes("LadyHaha","Q: What do an old person, a Mexican man, and a high school student close to graduation have in common?\n" +
                "A: They're all seniors. ");
        joke.add(jokes);

        jokes=new Jokes("Anonymous","Teacher: Will any idiot in the room stand up please?\n" +
                "(a student stands up)\n" +
                "Teacher: Why do you think you are an idiot? Student: actually I don't, but I hate to see you standing there all by yourself. ");
        joke.add(jokes);

        jokes=new Jokes("heartc","Q: Why did the girl wear glasses in math class?\n" +
                "A: It improves di-vision. ");
        joke.add(jokes);

        jokes=new Jokes("Anonymous","A boy was at school and his teacher asked him to learn 3 new words over the weekend. His father is a pilot and taught him the word \"takeoff.\" His mother is a zoo keeper and taught him the word \"zebra.\" His big sister was going to have a baby and taught him the word \"baby.\" He went to school the next day and his teacher asked, ''What are your three words?'' The boy said, ''Takeoff zebra baby.'' ");
        joke.add(jokes);

        jokes=new Jokes("Anonymous","Chintu: \"You never study, so how come you don't fail your math tests?\"\n" +
                "Pintu: \"Because whenever there is a math test, I don't go to school!\" ");
        joke.add(jokes);

        jokes=new Jokes("rudikelly","A teacher asks her class what their favorite letter is. A student puts up his hand and says 'G'. The teacher walks over to him and says, \"Why is that, Angus?\" ");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","");
        joke.add(jokes);

        return joke;
    }

    public String toString(){
        return "የትምርት ቀልዶች";
    }
}