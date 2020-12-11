package edu.uwb.css143b2020fall.service;
/*
    Nam Nguyen
    December 10, 2020
    CSS 143b
    Final Project

 */

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class IndexerImpl implements Indexer {
    public Map<String, List<List<Integer>>> index(List<String> docs) {
        Map<String, List<List<Integer>>> indexes = new HashMap<>();
        // add your code
        for (int i = 0; i < docs.size(); i++) {
            List<List<Integer>> positions = new LinkedList<>();
            List<Integer> loc  = new LinkedList<>();
            String doc = docs.get(i);
            String[] words = doc.split("\\s+");
            for (int j = 0; j < words.length; j++) {
                loc.add(0);
                positions.add(loc);
                indexes.put(words[j], positions);
            }
        }

        return indexes;
    }
}