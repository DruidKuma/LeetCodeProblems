package com.druidkuma.leetcode.spotify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 609
 *
 * Given a list paths of directory info, including the directory path, and all the files with contents in this directory, return all the duplicate files in the file system in terms of their paths. You may return the answer in any order.
 *
 * A group of duplicate files consists of at least two files that have the same content.
 *
 * A single directory info string in the input list has the following format:
 *
 * "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
 * It means there are n files (f1.txt, f2.txt ... fn.txt) with content (f1_content, f2_content ... fn_content) respectively in the directory "root/d1/d2/.../dm". Note that n >= 1 and m >= 0. If m = 0, it means the directory is just the root directory.
 *
 * The output is a list of groups of duplicate file paths. For each group, it contains all the file paths of the files that have the same content. A file path is a string that has the following format:
 *
 * "directory_path/file_name.txt"
 */
public class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> contentsToPaths = new HashMap<>();
        for (String path : paths) {
            String[] parts = path.split(" ");
            String basePath = parts[0];
            for (int i = 1; i < parts.length; i++) {
                String[] contentsAndFileName = parts[i].split("\\(");
                contentsAndFileName[1] = contentsAndFileName[1].replace(")", "");
                contentsToPaths.putIfAbsent(contentsAndFileName[1], new ArrayList<>());
                contentsToPaths.get(contentsAndFileName[1]).add(String.format("%s/%s", basePath, contentsAndFileName[0]));
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> value : contentsToPaths.values()) {
            if (value.size() > 1) result.add(value);
        }
        return result;
    }
}
