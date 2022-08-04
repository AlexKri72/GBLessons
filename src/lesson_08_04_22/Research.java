package lesson_08_04_22;

import java.util.List;

public class Research {
    public static void printAllChildren(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
            el.getLink() == Relation.PARENT) {
                System.out.println(el.getPersonSecond());
            }
        }
    }
}
