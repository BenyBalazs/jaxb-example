package legoset;

import jaxb.JAXBHelper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

            LegoSet legoSet = new LegoSet();
            legoSet.setNumber("75211");
            legoSet.setName("Imperial TIE Fighter");
            legoSet.setTheme("Star Wars");
            legoSet.setSubtheme("Solo");
            legoSet.setYear(Year.parse("2018"));
            legoSet.setPeaces(519);
            Set<String> tags = new LinkedHashSet<>();
                tags.add("Starfighter");
                tags.add("Stormtrooper");
                tags.add("Star Wars");
                tags.add("Solo");
            legoSet.setTags(tags);
            List<Minifig> minifigs = new ArrayList<>();
                minifigs.add(new Minifig(2,"Imperial Mudtrooper"));
                minifigs.add(new Minifig(1,"Imperial Pilot"));
                minifigs.add(new Minifig(1,"Mimban Stormtrooper"));
            legoSet.setMinifigs(minifigs);
            legoSet.setWeight(new Weight("kg",0.89));
            legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoSet, new FileOutputStream("LegoSet.xml"));
        JAXBHelper.toXML(legoSet, System.out);
    }
}
