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
public class Eng_Working_Jokes extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.eng_work_jok, null);
        RecyclerView rv=(RecyclerView)v.findViewById(R.id.mRecyclerWork);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getWorkJokes()));

        return v;
    }

    private ArrayList<Jokes> getWorkJokes() {
        ArrayList<Jokes>joke=new ArrayList<>();
        Jokes jokes=new Jokes("ሰባተኛ ፎቅ","ሰውየው ሰባተኛ ፎቅ በረንዳ ላይ ሆኖ ንፋስ ይቀበላል። አካባቢውን እየቃኘ እያለ አንድ ሰው ምድር ላይ ሆኖ እጁን ሲያውለበልብለት ይመለከታል።\n" +
                "በድምፅ መደማመጥ ስላልቻሉ ምድር ያለው ሰውዬ ሰባተኛ ፎቅ ላይ ያለውን ሰውዬ በምልክት 'ና' ይለዋል።\n" +
                "ሰባተኛ ፎቅ ላይ የነበረው ሰውዬ ስለሰውዬው ማንነትና ስለፈለገው ነገር እያሰበ ከፎቁ ይወርዳል። የምድሩ ሰውዬ ጋር እንደደረሰም:\n" +
                "ፎቅ ላይ የነበረው: \"አቤት ወንድሜ ምን ፈልገህ ነው?\"\n" +
                "ምድር ላይ ያለው: ፊቱን አሳዛኝ ካደረገ በኋላ \"ይቅርታ ጌታዬ አለፋሁዎት አይደል? ለማኝ ነኝ። እስኪ ስለ እግዚአብሔር ብለው ያለዎትን ይመፅውቱኝ\"\n" +
                "ሲለው ሰውየው ከሰባት ፎቅ ድረስ በቁም ነገር ወርዶ በሰማው ነገር እጅግ ስለተበሳጨ ለማኙን ካልገደልኩ ብሎ አስቸገረ።\n" +
                "ትርምሱ በአገላጋዮች ከረገበ በኋላ ለማኙ ላይ እየዛተ ወደነበረበት ፎቅ ይመለሳል።\n" +
                "እየተመለሰ እያለ ግን ለማኙ የምሩን ተቸግሮስ ቢሆን እያለ እያሰበ ነበር።\n" +
                "መጀመሪያ የነበረበት ሰባተኛ ፎቅ ላይ ደርሶ ወደታች ሲመለከት ለማኙ አሁንም አንጋጦ ሲመለከተው ያያል።\n" +
                "ተስፋ ቆርጦ በረጅሙ ከተነፈሰ በኋላ ያፏጭና ለማኙን ይጠራዋል።\n" +
                "ለማኙ በደስታ እየተፍነከነከና የሰውዬውን ልብ ያራራለትን አምላክ እያመሰገነ ሰባተኛ ፎቅ ከወጣ በኋላ:\n" +
                "ምድር የነበረው (ለማኙ): እየተቅለሰለሰ \"አቤት የኔ ጌታ?\" ቢለው\n" +
                "ፎቅ ላይ ያለው (ተለማኝ): \"እግዚአብሔር ይስጥልኝ!!!\" ብሎት እርፍ!!! ");
        joke.add(jokes);

        jokes=new Jokes("ለፈገግታ","ሴትዮዋ በቀይ ፈንታ አረንጓዴ ልፕስቲክ ተቀብታ ወደ ገበያ ስታቀና ያዩዋት ሰዎች ሁሉ ምነው ሴትዬዋ አበደች እንዴ እያሉ ይስቁባታል።በዚህ ሁኔታ ብዙ ሰዎችን ካሳለፈች ቡኃላ የሚያውቋት ሰዎች ሲያይዋት ከንፈርዋን አረንጓዴ ቀለም ነው የተቀባችው ባሏ ደግሞ ሹፌር ነው።ሰዎቹም ምነው ይኅንን አረንጓዴ ቀለም ልፕስቲክ ተቀባሽ??ስው እኮ የሚስቅብሽ ቀይ ልፕስቲክ መቀባት ነበረባት እያለ ነው ሲሏት እሷም ቀበል አድርጋ ባለቤቴ ሾፌር ስለሆነ የተከለከለ እንዳይመስለው ነው። :D አለች ይባላል\n" +
                "« ምንጭ አቶ ይድነቃቸው ተሰማ ከዛሬ 25 ዓመት በፊት ለእኍድ የሬድዮ መዝናኛ ካቀረቡት ተብሎ በ ቪ ኦ ኤ የሰማሁት ነው »\n" +
                "\n");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        return joke;
    }

    public String toString(){
        return "የስራ ቀልዶች";
    }
}