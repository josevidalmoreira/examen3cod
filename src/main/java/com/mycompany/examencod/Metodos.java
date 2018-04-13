
package com.mycompany.examencod;

import java.io.File;
import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import static javax.management.Query.div;
import javax.swing.text.Document;
import org.jsoup.*;


public class Metodos {
  Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
log(doc.title());
Element masthead = doc.select("<div class=\"today_nowcard-phrase\">Parcialmente nublado</div>").first();
  // div with class=masthead
for (Element masthead : newsHeadlines) {
  log("%s\n\t%s", 
    masthead.attr("title"), masthead.absUrl("href"));
}

}
