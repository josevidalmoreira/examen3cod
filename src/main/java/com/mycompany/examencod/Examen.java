
package com.mycompany.examencod;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import org.jsoup.Jsoup;


public class Examen {


    public static void main(String[] args) {
        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
log(doc.title());
Element masthead = doc.select("<div class=\"today_nowcard-phrase\">Parcialmente nublado</div>").first();
  // div with class=masthead
for (Element masthead : newsHeadlines) {
  log("%s\n\t%s", 
    masthead.attr("title"), masthead.absUrl("href"));
  
  
}
    }
    
}
