package main.Questions.ID24532662;

import java.util.*;

public class SortPersons {
    public int[] sort(int[] persons, int[] positions) {
        ArrayList<Person> personsCollection = getPersonsCollection(persons, positions);
        ArrayList<Integer> sortedPersonsHeight = sortPersonsHeight(personsCollection);
        return mapToArrayInt(sortedPersonsHeight);
    }

    private int[] mapToArrayInt(ArrayList<Integer> sortedPersonsHeight) {
        int[] sorted = new int[sortedPersonsHeight.size()];
        for (int i = 0; i < sortedPersonsHeight.size(); i++) {
            sorted[i] = sortedPersonsHeight.get(i);
        }
        return sorted;
    }

    private ArrayList<Integer> sortPersonsHeight(ArrayList<Person> personsCollection) {
        ArrayList<Integer> sortedPersons = new ArrayList<Integer>();
        sortedPersons.add(personsCollection.remove(0).height);
        for (Person person : personsCollection) {
            int expectedPosition = 0;
            for (int i =0;i<=sortedPersons.size();i++) {
                if (expectedPosition >= person.position) {
                    sortedPersons.add(i, person.height);
                    break;
                }
                if (sortedPersons.get(i) > person.height) expectedPosition++;
            }
        }
        return sortedPersons;
    }

    private ArrayList<Person> getPersonsCollection(int[] heights, int[] positions) {
        ArrayList<Person> personsCollection = new ArrayList<Person>();
        for (int i = 0; i < heights.length; i++) {
            personsCollection.add(new Person(heights[i], positions[i]));
        }
        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.position==p2.position){
                    return p2.height-p1.height;
                }
               else return p1.position - p2.position;
            }
        };
        Collections.sort(personsCollection, personComparator);
        return personsCollection;
    }
}

