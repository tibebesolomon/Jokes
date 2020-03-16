package com.ethiopia.app.jokes.Fragments;

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
public class Amh_School_jokes extends Fragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){

        View v=inflater.inflate(R.layout.amh_school_jok,null);
        RecyclerView rv=(RecyclerView)v.findViewById(R.id.mRecyclerSchool);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getSchoolJokes()));

        return v;
    }

    private ArrayList<Jokes> getSchoolJokes() {
        ArrayList<Jokes>joke=new ArrayList<>();
        Jokes jokes=new Jokes("ከተመራቂ ተማሪዎች last word ዘና ያደረጉኝ","1☞ ሳይማር ያስተማረኝን መንግስት ከልብአመሰግናለሁ።\n" +
                "2☞የሚረዳኝ የለምና ስራ ፈልጉልኝ።\n" +
                "3☞ ሳይማር ያስተማረኝን መምህሬን አመሰግናለሁ።\n" +
                "4☞ሳልሸከመው የከበደኝ ነገር ሰው ብቻ ነው።\n" +
                "5*- ስማር ያሽሟጠጡ ሊበሉ ቤት መጡ፣\n" +
                "6*- መመረቄን ንገሩት ለ A+.....\n" +
                "7*- ልጠርብሽ ነው!! (ኮብል ስቶን)\n" +
                "8*- ሰፊው ህዝብ ሆይ የተማረ ይግደለኝ አላልክም? ይኸው መጣሁልህ፡፡\n" +
                "9*- ከንግዲ በሃላ ደና ሁን በግ ተራ\n" +
                "እናንተስ ዘና ያደረገችሁ የትኛው ነው?\n" +
                "ሌላ ካለ ጨምሩበት......");
        joke.add(jokes);

        jokes=new Jokes("መምህር","መምህር——- በግ በእንግሊዘኛ ምን\n" +
                "ይባለል\n" +
                "alexs ———- SHEEP\n" +
                "መምህር——- ጎበዝ!!! እሺ ቀንድ ያለው\n" +
                "በግስ\n" +
                "alexs ———- SCHOLAR SHEEP\n" +
                "ነዋ!!!!!\n" +
                "መምህር ——– Aንተ የድንጋይ ወንድም\n" +
                "ኮብልስቶን ፊት\n" +
                "alexs ———- እሺ\n" +
                "መምርህ ——– ሌላ ጥያቄ ሳሙና\n" +
                "በእንግሊዘኛ ምን ይባላል\n" +
                "alexs ——— B 29");
        joke.add(jokes);

        jokes=new Jokes("ፈተና"," የግል ት/ቤት ነው፡፡ፈተና ተሰረቀ፡፡ \n" +
                "ተፈተኑ፡፡ ታረመ፡፡ ሁሉም 100% አመጡ፡፡ \n" +
                "ወላጆች ውጤቱን አዩ፡፡ምን ቢሉ ጥሩ ነው? \n" +
                "“…ፈተናውን ያረመው ምርጫ ቦርድ ነው እንዴ?”");
        joke.add(jokes);

        jokes=new Jokes("አንድ ቀን ቤቢ አስተማሪውን እንዲ ብሎ ይጠይቃል።","ቤቢ :- “ዝሆንን ፍሪጅ ውስጥ እንዴት ነው ምንከተው?”\n" +
                "መምህር :- “እኔ እንጃ .. እንዴት ነው?”\n" +
                "ቤቢ :- “ፍሪጁን እንከፍትና እንከተዋለን!”\n" +
                "ሌላ ጥያቄ አሁንም ደገመ\n" +
                "ቤቢ :- “እሺ ቀጭኔን እንዴት እንከታለን?”\n" +
                "መምህር: -“እእእእ ይሄ ቀላ ነው… ፍሪጁን  ትከፍትና ትከተዋለህ”\n" +
                "ቤቢ:-“አይደለም መጀመርያ በሩን ትከፍትና ዝሆኑን አውጥትህ ቀጭኔውን ትከታለህ።”\n" +
                "አሁንም ሌላ ጥያቄ ጠየቀ\n" +
                "ቤቢ :-“እሽ ሀሉም እንሰሳት ለአንበሳ የልደት ድግስ ተጠርተው ሄዱ ከአንድ እንስሳ ውጭ ማናት ያች እንስሳ?”\n" +
                "መምህሩም ግራ በመጋባት :-” አንበሳ”\n" +
                "ቤቢ :- “አይደለም! ቀጭኔ ናት ምክንያቱም ፍሪጅ ውስጥ ነው ያለችው!”\n" +
                "….ሌላ የመጨረሻ ጥያቄ ይጠይቀዋል\n" +
                "\n" +
                "ቤቢ :-“አዞወች የሞሉበት ወንዝ ማቋረጥ ከፍለክ እንዴት ታልፋለህ?”\n" +
                "መምህር :-“በድልድይ ታልፋለህ።”\n" +
                "ቤቢ :-“አይደለም! ዋኝተህ ታልፋለህ ምክንያቱም ሁሉም አዞወች የአንበሳ የልደት ድግስ ሄደዋል።”\n" +
                "\n" +
                "መምህር :-“እስኪ እራሱን ሰነፍ እድርጎ ሚያስብ ይነሳና ይቁም?!”\n" +
                "**ማንም አልተነሳም**\n" +
                "መምህር :-“እርግጠኛ ነኝ እዚ አካባቢ ሰነፎች አይጠፉም”\n" +
                "**ቤቢ ይነሳና ይቆማል**\n" +
                "መምህር :- “እህ ቤቢ እራስህን ሰነፍ እድርግህ ታስባለህ?”\n" +
                "ቤቢ: – “አይ ብቻህን ስትቆም ቅር ብሎኝ ነው።”");
        joke.add(jokes);

        jokes=new Jokes("አዲሷ ተማሪ","የሒሳብ አስተማሪ:-《ብሩክ 12 ቸኰሌት ቢኖርህ እና 5 ለጓደኛህ ለደረጄ ብትሰጠው አንዱን ለአዲሷ ተማሪ ብትሰጣት ስንት ቸኮሌት ይቀርሃል？》\n"+
                "ብሩክ:-《ይቅርታ መምህር ለደረጄ አልሰጥም！ሁሉንም ቸኰሌት ለአዲሷ ተማሪ ነው የምሰተው！》");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);



        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        return joke;
    }
    public String toString(){
        return "የትምርት ቀልዶች";
    }
}
