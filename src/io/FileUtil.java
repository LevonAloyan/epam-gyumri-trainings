package io;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileUtil {

    public static void main(String[] args) {
        List<File> search = search(
                new File("C:\\Users\\Admin\\trainings\\epam-gyumri-trainings\\src\\io\\newDir"),
                "*test*");

        for (File file : search) {
            System.out.println(file.getName());
        }
    }

    public static List<File> search(File dirToSearchIn, String fileNameMask) {
        if (dirToSearchIn == null || dirToSearchIn.isFile()) {
            System.err.println("Error while processing");
            return Collections.EMPTY_LIST;
        }
        if (fileNameMask == null || fileNameMask.isEmpty()) {
            System.err.println("File mask is blank");
            return Collections.EMPTY_LIST;
        }

        List<File> resultList = new ArrayList<>();
        search0(resultList, dirToSearchIn, fileNameMask);

        return resultList;
    }

    private static void search0(List<File> resultList, File currentDir, String fileNameMask) {
        File[] filesInCurrentDirectory = searchFilesInCurrentDirectory(currentDir);

        addMatchedFiles(filesInCurrentDirectory, fileNameMask, resultList);

        File[] subDirs = findSubDirs(currentDir);
        for (File subDir : subDirs) {
            search0(resultList, subDir, fileNameMask);
        }

    }

    private static File[] findSubDirs(File currentDir) {
        return currentDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
    }

    private static File[] searchFilesInCurrentDirectory(File currentDir) {
        return currentDir.listFiles(new FileFilter() {


            @Override
            public boolean accept(File file) {
                return file.isFile();
            }
        });
    }

    /**
     * test* //fsdtest-1, 3test
     * *test //3test
     * *test* // 3test-1
     * *
     */

    private static void addMatchedFiles(File[] files, String fileNameMask, List<File> resultList) {
        if (fileNameMask.equals("*")) {
            resultList.addAll(Arrays.asList(files));
            return;
        }

        for (File file : files) {
                if (fileNameMask.endsWith("*") && fileNameMask.startsWith("*")) {

                        String fileNameToSearch = fileNameMask.substring(1, fileNameMask.length() - 1);
                        if (file.getName().contains(fileNameToSearch)) {
                            resultList.add(file);
                        }
                    }
                else if (fileNameMask.startsWith("*") || fileNameMask.endsWith("*")) {
                    if (fileNameMask.endsWith("*")) {
                        String prefix = fileNameMask.substring(0, fileNameMask.indexOf("*"));
                        if (file.getName().startsWith(prefix)) {
                            resultList.add(file);
                        }
                    } else if (fileNameMask.startsWith("*")) {
                        String suffix = fileNameMask.substring(fileNameMask.indexOf("*") + 1);
                        if (file.getName().endsWith(suffix)) {
                            resultList.add(file);
                        }
                    }
                }
            }
        }
    }


