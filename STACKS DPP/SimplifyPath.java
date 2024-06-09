// Given an absolute path for a file (Unix-style), simplify it. An absolute path always begins with a '/' (root directory). The '.' in the path represents the current directory, and '..' represents the parent directory. The goal is to return the canonical path.

// Examples
// Example 1:

// Input: /apnacollege/
// Output: /apnacollege

import java.util.*;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        String paths[] = path.split("/");

        Stack<String> s = new Stack<>();
        for (int i = 0; i < paths.length; i++) {
            if (paths[i].equals(".")) {
                continue;
            } else if (paths[i].equals("")) {
                continue;
            } else if (paths[i].equals("..")) {
                if (s.size() > 0) {
                    s.pop();
                }
            } else {
                s.push(paths[i]);
            }
        }
        String result = "/" + String.join("/", s);

        // Return the result or root if stack is empty
        return result;
    }

    public static void main(String args[]) {
        String path = "/c//downloads/./songs/../songs/tiger3.mp3/";
        System.out.println(simplifyPath(path));
    }
}
