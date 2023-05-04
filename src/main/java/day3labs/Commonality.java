package day3labs;

import java.util.*;

public class Commonality {


    public List<String> mostCommonWords(List<String> listOfWords, int numOfWordsWanted){
        List<String> orderedWordList = sortDistinctWordsByCount(listOfWords);
        Collections.reverse(orderedWordList);
        return orderedWordList.subList(0,numOfWordsWanted);
    }

    public List<String> sortDistinctWordsByCount(List<String> listOfWords){
        listOfWords.replaceAll(String::toLowerCase);
        listOfWords.sort(String::compareTo);

        Map<String, Integer> wordCount = new HashMap<>();

        listOfWords.stream().distinct()
                .forEach((word) -> {
                    int count = listOfWords.lastIndexOf(word) - listOfWords.indexOf(word) + 1;
                    wordCount.put(word,count);
                });

        List<String> uniqueWords = new ArrayList<>(listOfWords.stream().distinct().toList());

        uniqueWords.sort(Comparator.comparing(wordCount::get));
        return uniqueWords;
    }

    public List<String> leastCommonWords(List<String> listOfWords, int numOfWordsWanted){
        List<String> orderedWordList = sortDistinctWordsByCount(listOfWords);
        return orderedWordList.subList(0,numOfWordsWanted);



    }

}
