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
public class Amh_Life_Jokes extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.amh_life_jok, null);
        RecyclerView rv=(RecyclerView)v.findViewById(R.id.mRecyclerLife);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getLifeJokes()));

        return v;
    }

    private ArrayList<Jokes> getLifeJokes() {
        ArrayList<Jokes>joke=new ArrayList<>();
        Jokes jokes=new Jokes("ፍቅረኛውን ደውሎ እያናገራት ነው","ወንዱ:- ፍቅሬ\n" +
                "ሴቷ:- አቤት ማሬ\n" +
                "ወንዱ:- ለኔ ያለሽን ፍቅር በ1 ነገር ግለጪ\n" +
                "ብትባይ በምን ትገልጪዋለሽ\n" +
                "ሴቷ:- እንዴ ማሬ እኔ ላንተ ያለኝን ፍቅር\n" +
                "ሊገልፅ የሚችል አንዳችም ነገር ያለ\n" +
                "አይመስለኝም\n" +
                "ወንዱ:- በአንድ ነገር ግለጪ ብትባይስ\n" +
                "ሴቷ:- እሺ በቃ እኔ የሞባይል ቀፎ ነኝ አንተ\n" +
                "ደግሞ ሲም ካርድ ነህ ቀፎ ያለ ሲም ባዶ\n" +
                "እንደሆነ ሁሉ እኔም ያለ አንተ ባዶ ነኝ\n" +
                "ወንዱ:- በጣም ነው የምወድሽ ብሎ ስልኩ\n" +
                "ተዘጋ\n" +
                "ሴቷም ወደ ሰማይ ቀና ብላ ተመስገን\n" +
                "አምላኬ እንኩዋን ባለ ስንት ሲም ቀፎ\n" +
                "እንደሆንኩ አላወቀ አለች");
        joke.add(jokes);

        jokes=new Jokes("የኔ ፍቅር","ወንዱ :- ይሄንን ቀን በጉጉት ስጠብቅ ነበር\n" +
                "ሴቷ :- ትቼህ እንድሄድ ትፈቅድልኛለህ ?\n" +
                "ወንዱ :- በፍፁም\n" +
                "ሴቷ :- ትወደኛለህ ?\n" +
                "ወንዱ :- አዎን\n" +
                "ሴቷ :- በላዬ ላይ ከሌላ ሴት ጋር\n" +
                "ታመነዝራለህ ?\n" +
                "ወንዱ :- በፍፁም አላደረገውም\n" +
                "ሴቷ :- ትስመኛለህ ?\n" +
                "ወንዱ :- ባገኘሁት አጋጣሚ ሁሉ\n" +
                "ሴቷ :- ትመታኛለህ ?\n" +
                "ወንዱ :- ምን በወጣኝ\n" +
                "ሴቷ :- ልመንህ ?\n" +
                "ወንዱ :- Yes\n" +
                "ሴቷ :- የኔ ፍቅር\n" +
                "” ከጋብቻ በኋላ ከታች ወደ ላይ አንብቡት ”");
        joke.add(jokes);

        jokes=new Jokes("የሳምንቱ ምርጥ ቀልዶች","1. እሷ: ስንጋባ ጫት መቃምህን.         ታቆማለህ.\n" +
                "እሱ: እሺ\n" +
                "እሷ: ሲጋራም ማጨስ አትችልም\n" +
                "እሱ: እሺ\n" +
                "እሷ: የሰካራም ሚስት እንድባልም አልፈልግም ስለዚህ\n" +
                "መጠጥም ማቆም አለብህ\n" +
                "እሱ: እሺ\n" +
                "እሷ: ኧ!!! …ሌላ ደሞ ምን ነበር?? አዎ! እያመሸህ\n" +
                "መግባት\n" +
                "አትችልም\n" +
                "እሱ: እሺ\n" +
                "እሷ: እም…ሌላ? ሌላ? ምንድነው የረሳሁት??? ሌላ\n" +
                "የምትተወው ነገር ምን ነበር???…..\n" +
                "\n" +
                "እሱ: አንቺን ማግባት");
        joke.add(jokes);

        jokes=new Jokes("የስልክ ቢል!"," ባል የስልክ ሊከፍል ቴሌ ይሄድና 890 ብር እንደቆጠረ ይናገረዋል፡፡ ይሄኔ በብስጭት እየተጣደፈ ወደቤቱ ይሄድና በሩን በርግዶ ይገባል፡፡\n" +
                "\n" +
                "ባል፡- እኔ የዚህ ቤት ነገር እየበቃኝ ነው፤ በብስጭትና በድህነት እኔን ለመግደል ሳትነሱ አልቀራችሁም፡፡ አሁን ከቴሌ የቤቱ ስልክ 900 ብር ቆጠረ ተብዬ ነው የመጣሁት… እኔ እንደሆነ ወሩን ሙሉ ይሄን ስልክ አልተጠቀምኩም፤ ስልክ መደወል ስፈልግም በቢሮዬ ስልክ ነው የምጠቀመው … አስቸኳይ ነገር ቢያጋጥመኝ እንኳን እንደምንም ጉዳዩን አሳድሬ ስራ ቦታ ነው የምደውለው… ማን ነው ስልኬን እንደልቡ ሲጫወትበትት የከረመው???\n" +
                "\n" +
                "ሚስት፡- ኧረ እኔ ምንም ደውዬበት አላውቅም፤ መቼ ለት እንኳን ለአዲስአመት ዘመድ ወዳጆቻችንን “እንኳን አደረሳችሁ” ልል ፈልጌ ሁሉንም በመስሪያቤቴ ስልክ አዳርሼ ነው የመጣሁት…\n" +
                "\n" +
                "ይሄኔ ባልም ሚስትም ወደ ቤት ሰራተኛዋ ሰርኬ ዞር አሉ\n" +
                "\n" +
                "ሰርኬ ፡ ኧረገኝ!!! ጋሽዬና እትዬ ደግሞ… ምነው እኔ ላይ አፈጠጣችሁብኝሳ?? … እኔም በመስሪያቤቴ ስልክ ነው የተጠቀምኩት… ምን ታካብዳላችሁ?");
        joke.add(jokes);

        jokes=new Jokes("ሚስት","ሚስት( ትደውልና) የማትረባ! ደደብ! የት አባክ ነው\n" +
                "ያለከው?\n" +
                "-ባል፦ ፒያሳ ነኝ!\n" +
                "-ሚስት፦ እዛ ምን ትሰራለሀ?!\n" +
                "-ባል፦አንዴ ትዝ ካለሽ የሆነ ወርቅ ቤት አልጎበኘንም?\n" +
                "-ሚስት፦ አስታወስኩት ውዴ\n" +
                "ባል፦ የወርቅ ሀብል አይተሽ ወደድኩት ስትይ ገንዘብ ሳገኝ\n" +
                "እገዛልሻለው አላልኩም?\n" +
                "ሚስት፦አዎ የኔ ፍቅር.\n" +
                "ባል፦ ወርቅ ቤቱን አወቅሽው?\n" +
                "ሚስት፦አዎ ወለላዬ\n" +
                "ባል፦ከእሱ አጠገብ ያለው ግሮሰሪ ነኝ");
        joke.add(jokes);

        jokes=new Jokes("ሚስት አምሽታ ወደቤት"," እየገባች ነው …\n" +
                "ወድያው የመኝታ ቤቷን ከፍታ ስትገባ\n" +
                "አልጋዋ ላይ ሁለት የተኙ ሰዎችን\n" +
                "ትመለከታለች፤ አራት እግሮች ከብርድ ልብሱ\n" +
                "ስር ወተው ይታያሉ\n" +
                "ከዝያም ወድያውኑ አጠገቧ ያለውን ዱላ አንስታ\n" +
                "ከብርድ ልብሱ ውስጥ ያሉትን ሁለቱን ሰዎች\n" +
                "ባላት ኃይል መደብደብ ትጀምራለች ..ወድያው\n" +
                "መደብደቡን ታቆምና ወደ ሳሎን ቤት ስትሄድ\n" +
                "ባሏ ሶፋ ላይ ቁጭ ብሎ ጋዜጣ ያነብ ነበር\n" +
                "ከዝያም ባልየው ” hi darling…ቤተሰቦችሽ\n" +
                "መተዋሉ\n" +
                "የኛ መኝታ ቤት ተኝተዋል ሰላም አልሻቸው ..?\n" +
                "ሲላት ሚስት በድንጋጤ እራሷን ስታ ወደቀች ::\n" +
                "“የጅብ ችኩል ቀንድ ይነክሳል አሉ”");
        joke.add(jokes);

        jokes=new Jokes("ባል ጣዕረ-ሞት ይዞት"," እያጣጣረ ሳለ ሚስቱን ያስጠራና\n" +
                "“እንግዲህ እኔ መሞቴ ነው፤ አንቺ ግን ያለ ባል መቅረት\n" +
                "የለብሽም፤ እንዲያውም ያንን ኩራባቸውን አግቢ”\n" +
                "ይላታል። በዚህ አባባል የተናደደችው ሚስት “አንተን\n" +
                "ይማርልኝ እንጂ እኔ አሁን ስለ ባል አላስብም! ደግሞ\n" +
                "ባገባስ እንዴት ያንተን ዋነኛ ጠላት ኩራባቸውን አግቢ\n" +
                "ትለኛለህ?” ስትል ትጠይቀዋለች። በዚህ ጊዜ ጣር የያዘው\n" +
                "ባል እያቃሰተ መለስ ብሎ “አንቺ ደሞ አይገባሽም እንዴ?\n" +
                "ጠላቴ መሆኑንማ መች አጣሁት? ልክ እንደ እኔ\n" +
                "አንገብግበሽ እንድትገድይልኝ ነው እንጂ! አላት ይባላል።\n" +
                "ኑዛዜ ይልሃል ይህ ነው! ከእንዲህ አይነቱ ኑዛዜ\n" +
                "ይሰውራችሁ ይሰውረን አሜን አሜን በሉ።");
        joke.add(jokes);

        jokes=new Jokes("ብልጥ ለብልጥ","አበበ የወይራ ፍሬ ሊገዛ ሱቅ ይሄዳል::ባለሱቁም ሊያጭበረብረው ሚዛኑ ላይ ትልቅ ምስማር ያስቀምጣል::ባለሱቁ መዝኖ እንደጨረሰ፣አበበ ኮስተር ብሎ ምስማሩን ከፍሬዎቹ ጋር እየወሰደ፣<<ከፍየበታለው-ልውሰደው እንጂ!>>አለው ");
        joke.add(jokes);

        jokes=new Jokes("ለጥምቀት ያልሆነ...","የጋብሮቮዋ ሚስት፣<<ሾርባው ውስጥ ስንት እንቁላል ልጨምር?>>ስትል ባለቤቷን ትጠይቃለች::\n"+
        "<<እእ...ዛሬ በዓል ስለሆነ፣ግማሽ እንቁላል መጨመር ትችያለሽ>>ሲል መለሰ::");
        joke.add(jokes);

        jokes=new Jokes("ትዳር","ዛሬ እንዴት ነው? ዘንጠሃል!\n" +
                "- የጋብቻዬን 50ኛ አመት የወርቅ ኢዮቤልዩ እያከበርኩ ነው።\n" +
                "- ተው እንጂ! ገና ካገባህ 5 ዓመትህ አይደለም እንዴ? የኔ ወንድም?\n" +
                "- - - ለኔ እያንዳንዱ ዓመት እንዴት እንደ 10 ዓመት እንደረዘመብኝ\n" +
                "እኔ ነኝ የማውቀው።");
        joke.add(jokes);

        jokes=new Jokes("ሰርፕራይዝ","ልጅት ወደ መናፈሻ ጎራ ትልና አንድ ማረፊያ ቦታ ታገኝና ቁጭ ትላለች። በአጋጣሚ እርስዋን የሚያውቃት ልጅ ከሩቅ ሆኖ አይቶዋት ኖሮ፡ ፈጠን ፈጠን እያለ ተራምዶ ከሁዋላዋ ይጠጋትና ሁልቱንም አይኖችዋን በሁለት እጆቹ ግጥም አርጎ ይዞ፣” ሰርፕራይዝ ! ለመሆኑ አወቅሽኝ? “ ይላታ ፤ እርስዋም እጆቹን በሁለት እጆችዋ እየዳበሰች ” ይቅርታ ማነህ አላወቅሁም “ ትለዋለች ። እርሱም “ካላወቅሽኝ ትቀጪያለሽ፤ “ ልጅት ” ወይ በናትህ ቅጣቱ ከባድ ነው? “ እሱ ” እንዴ በጣም እንጂ ባንዴ ካላውቅሽኝ እስምሻለሁ ! “ ልጂት “እንዴ” እርሱ ” አዎ ቀልዴን አይደለም ። በህለተኛውም ካላወቅሽኝ ደግሞ ቅጣቱን አከብደዋለሁ። ” ልጅት ” እረ በእናትህ በጣም ከባድ ነው ቅጣቱ?” እርሱ ” አዎ! በሁለተኛው ሞክረሽ ካላውቅሽኝ ከምር – እደፍሪሻለሁ!!!” ልጅት ” እንዴ” እርሱ ” አዎ ከምሬ ነው፤ ይልቅስ ጊዜ አትውሰጅ ቶሎ በይ!” ልጂት ትንሽ እንደማሰብ አድርጋ “….እ…እ..እ ኦኬ! በቃ ማንትሆን? እስቲ ቆይ ቆይ …..እ…እ.. ኦኬ መንግስቱ ኃይለ ማሪያም ነህ? “");
        joke.add(jokes);

        jokes=new Jokes("ሴት ጓደኛሞች","“የኔ ቦይ ፍሬንድ ባለፈው አልማዝ ያለው የወርቅ ቀለበት ገዛልኝ በቀደም ደሞ ቆንጆ የእራት ልብስና ብራስሌት ገዛልኝ” ። ምን አለፋሽ የምለብሰው ፣ የምበላው ፣ የምጠጣው ሁሉ እርሱ በሚያረግልኝ ነው።\n" +
                "ከትናንት ወዲያ ደሞ እባክሽ እንጋባ አለኝ ግን ገና መልስ አልሰጠሁትም። አንቺ ምን ትመክሪኛለሽ?\n" +
                "- ሁለተኛዋ - “አይ ወንዶች በጣም ይገርማሉ እኮ ለጊዜው እሺ እንጋባ እንዳትይው ። ገባሽ? እርሱ እኮ ገንዘቡን መቆጠብ ፈልጎ ነው! ትንሽ ይጠብቅ!” ።");
        joke.add(jokes);

        jokes=new Jokes("ጨርቆስ እና ቦሌ","አንድ አራዳ መሆን የፈለገ የቦሌ ሰፈር ልጅ፤ ከጨርቆስ ሰፈር አንድ ጉዋደኛ ይተዋወቅና ለጥምቀት ወደ ጃንሜዳ ያቀናሉ፤ እዛ እንደደረሱም፤ የጨርቆሱ ልጅ ፤ እዛው ሸንኮራ አገዳ ከሚሸጥበት ሁለት ፍሬ ያስቆርጥ እና አንዱን፤ ለቦሌው ልጅ ይሰጠዋል፤ በግርገሩ መሃለ የጨርቆሱ ልጅ የራሱን ሸንኮራ ጨርሶ ዘወር ሲል የቦሌው ልጅ ሸንኮራውን በጁ ይዞ ሲያገላብጥ ያየዋል ፤የጨርቆሱም ልጅ ምነው አትበላም እንዴ ሲለው፤ የቦሌዉም መልሶ ኦፕን(open) የሚለዉን እየፈለኩ ነው ብሎት እርፍ።");
        joke.add(jokes);

        jokes=new Jokes("ደርቆ ተንጣጣ","አንድ ሰሞን አለቃ በጣም ቆንጆ ልጅ ያገባሉ። ከዚያም ያው እንደ ባህል ወጉ ልጂቱ እሳቸው ጋ ልታድር ቤታቸው ትሄዳለች። እናም ቀኑ ተገባዶ ማታ ላይ አለቃ ቆጥ ላይ ወጥተው ሲጠብቋት እሷ ማታ ወደ ቤተሰቦቿ ከድታ ልትሮጥ ከቤት ስትወጣ ውጪው እንደአጋጣሚ ዝናባማ ስለነበር አድልጧት ትወድቅና ተመልሳ ቤት ትገባለች። ቤት ገብታም ምድጃ ዙሪያ ተቀምጣ ልብሷን ስታደርቅ ሳት ይላትና ጡጥ ታደርጋለች። ይህን የሰሙት አለቃ «አንቺ አትተኝም?» ይሏታል። እሷም «እስኪ ይቆዩ ልብሴ ምጥጥ ምጥጥ ይበልልኝ» ትላለች። እሳቸውም እሺ ብለም ዝም ሲሉ ልጂቱ አሁንም ደግማ ዛጥ ታደርጋለች።በሁኔታው የተቆጡት አለቃ በስጨት ብለው «አንቺ አትተኝም?» ሲሏት። እሷ «እስኪ ይቆዩ...ልብሴ ይድረቅ ትላለች።» ከዚያም አለቃ ቀጥለው «ኧረ ...ኤዲያ ...ልብስሽ ደርቆማ እየተንጣጣ» ብለው ባሽሙር ጠቅ አረጓት ይባላል።");
        joke.add(jokes);

        jokes=new Jokes("ሁለቱ እብዶች","ሁለት እብዶች ከአማኑኤል ሆስፒታል ዘበኛውን አታልለው ለማምለጥ ይመካከራሉ። በምክራቸው መሰረት ወደመግቢያው ሲያመሩ ዘበኛው በአካባቢው የለም። በመጥፋት ፋንታ እቅዳቸው እንደተበላሸ በማሰብ ወደነበሩበት ተመለሱ");
        joke.add(jokes);

        jokes=new Jokes("ጠረር አርገሽ ቅጂው","አለቃ አንድ ቤት በእንግድነት ሄደው ሳለ ጠላ ይጋበዛሉ። ጋባዥ የነበረችው ሴትዮም ጠላውን ልትደግማቸው ጎንበስ ብላ ስትቅዳ ንፋስ ፈሷ ያመልጣታል። አለቃም ሰምተው እንዳልሰማ ይሆናሉ። የቀረበላቸውን ሲጨርሱ ሴትዮዋ እንደገና መጥታ «አለቃ ልድገሞት» ትላለች። አለቃም «ልድገም ብለሽ ነው? በይ እስቲ እንደቅድሙ ጠረር አርገሽ ቅጂው» ብለው መፍሳቷን እንዳወቁ በዘዴ ተናገሩ።");
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
        return "የህይወት ቀልዶች";
    }

}
