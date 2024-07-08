package lesson5;

import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MapTasksTest {

    @Test
    @Tag(name = "Example")
    public final void shoppingListCostTest() {
        Map itemCosts = Map.of("Хлеб", 50.0, "Молоко", 100.0);
        assertEquals(150.0, MapTasks.shoppingListCost(List.of(new String[]{"Хлеб", "Молоко"}), itemCosts));
        assertEquals(150.0, MapTasks.shoppingListCost(List.of(new String[]{"Хлеб", "Молоко", "Кефир"}), itemCosts));
        assertEquals(0.0, MapTasks.shoppingListCost(List.of(new String[]{"Хлеб", "Молоко", "Кефир"}), emptyMap()));
    }


    @Test
    @Tag(name = "Example")
    public final void removeFillerWords() {
        assertEquals(List.of("Я", "люблю", "Котлин"),
                     MapTasks.removeFillerWords(List.of("Я", "как-то", "люблю", "Котлин"), new String[]{"как-то"}));
        assertEquals(List.of("Я", "люблю", "Котлин"), MapTasks.removeFillerWords(List.of("Я", "люблю", "Котлин"), new String[]{"как-то"}));
        assertEquals(List.of("Я", "люблю", "Котлин"), MapTasks.removeFillerWords(List.of("Я", "как-то", "люблю", "таки", "Котлин"),
                                                                                 new String[]{"как-то", "таки"}));
    }

    @Test
    @Tag(name = "Example")
    public final void buildWordSet() {
        //Дополните тесты далее сами
    }

    @Test
    @Tag(name = "Normal")
    public final void mergePhoneBooks() {
       
    }

    @Test
    @Tag(name = "Easy")
    public final void buildGrades() {
        assertEquals(emptyMap(), MapTasks.buildGrades(emptyMap()));
    }

    @Test
    @Tag(name = "Easy")
    public final void containsIn() {
        
    }

    @Test
    @Tag(name = "Normal")
    public final void averageStockPrice() {
       
    }

    @Test
    @Tag(name = "Normal")
    public final void findCheapestStuff() {
        
    }

    @Test
    @Tag(name = "Hard")
    public final void propagateHandshakes() {
        
    }

    @Test
    @Tag(name = "Easy")
    public final void subtractOf() {
        
    }

    @Test
    @Tag(name = "Easy")
    public final void whoAreInBoth() {
        assertEquals(emptyList(), MapTasks.whoAreInBoth(emptyList(), emptyList()));
        assertEquals(List.of("Marat"),
                     MapTasks.whoAreInBoth(List.of(new String[]{"Marat", "Mikhail"}), List.of(new String[]{"Marat", "Kirill"})));
        assertEquals(emptyList(),
                     MapTasks.whoAreInBoth(List.of(new String[]{"Marat", "Mikhail"}), List.of(new String[]{"Sveta", "Kirill"})));
    }

    @Test
    @Tag(name = "Normal")
    public final void extractRepeats() {
        assertEquals(emptyMap(), MapTasks.extractRepeats(emptyList()));
        assertEquals(Map.of("a", 2), MapTasks.extractRepeats(List.of(new String[]{"a", "b", "a"})));
        assertEquals(emptyMap(), MapTasks.extractRepeats(List.of(new String[]{"a", "b", "c"})));
    }

    @Test
    @Tag(name = "Normal")
    public final void hasAnagrams() {
        assertFalse(MapTasks.hasAnagrams(emptyList()));
        assertTrue(MapTasks.hasAnagrams(List.of(new String[]{"рот", "свет", "тор"})));
        assertFalse(MapTasks.hasAnagrams(List.of(new String[]{"рот", "свет", "код", "дверь"})));
        assertFalse(MapTasks.hasAnagrams(List.of(new String[]{"роттт", "свет", "ттор"})));
        assertTrue(MapTasks.hasAnagrams(List.of(new String[]{"ротт", "свет", "ттор"})));
    }

    @Test
    @Tag(name = "Impossible")
    public final void bagPacking() {
    }

}
