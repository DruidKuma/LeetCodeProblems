package com.druidkuma.leetcode.topgoogle;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        int currentLineCounter = 0;
        List<String> currentLine = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentLineCounter + currentWord.length() + currentLine.size() <= maxWidth) {
                currentLineCounter += currentWord.length();
            }
            else {
                result.add(justify(currentLine, currentLineCounter, maxWidth, false));
                currentLineCounter = currentWord.length();
                currentLine.clear();
            }
            currentLine.add(currentWord);
        }
        result.add(justify(currentLine, currentLineCounter, maxWidth, true));

        return result;
    }

    private String justify(List<String> line, int letterCount, int maxWidth, boolean isLast) {
        int numSpaces = maxWidth - letterCount;
        if (line.size() == 1) return line.get(0) + getSpaces(numSpaces);
        if (isLast) return String.join(" ", line) + getSpaces(numSpaces - (line.size() - 1));

        int numDelimeterSpaces = numSpaces / Math.max(line.size() - 1, 1);
        String delimeterSpaces = getSpaces(numDelimeterSpaces);
        int reminderSpaces = numSpaces - numDelimeterSpaces * Math.max(line.size() - 1, 1);

        StringBuilder lineBuilder = new StringBuilder();
        int[] reminderSpaceGroups = splitIntoParts(reminderSpaces, line.size() - 1);
        for (int i = 0; i < line.size(); i++) {
            String word = line.get(i);
            lineBuilder.append(word);
            if (i < line.size() - 1) {
                lineBuilder.append(delimeterSpaces).append(getSpaces(reminderSpaceGroups[i]));
            }
        }

        return lineBuilder.toString();
    }

    private static int[] splitIntoParts(int whole, int parts) {
        int[] arr = new int[parts];
        int remain = whole;
        int partsLeft = parts;
        for (int i = 0; partsLeft > 0; i++) {
            int size = (remain + partsLeft - 1) / partsLeft; // rounded up, aka ceiling
            arr[i] = size;
            remain -= size;
            partsLeft--;
        }
        return arr;
    }

    private String getSpaces(int num) {
        return new String(new char[num]).replace('\0', ' ');
    }
}
