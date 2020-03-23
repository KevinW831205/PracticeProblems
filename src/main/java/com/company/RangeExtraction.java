package com.company;

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        boolean checkingRange = false;
        Integer startNumber = null;
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] + 1 != arr[i + 1]) {
                    result.append(arr[i])
                            .append(",");
                } else {
                    if (arr[i + 1] + 1 != arr[i + 2]) {
                        result.append(arr[i])
                                .append(",")
                                .append(arr[i + 1])
                                .append(",");
                        i++;
                    } else {
                        startNumber = arr[i];
                        i += 2;
                        checkingRange = true;
                        while (arr[i] + 1 == arr[i + 1]) {
                            i++;
                        }
                        result.append(startNumber)
                                .append("-")
                                .append(arr[i])
                                .append(",");
                    }
                    checkingRange = false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                if (checkingRange) {
                    result.append(startNumber)
                            .append("-")
                            .append(arr[i])
                            .append(",");
                    break;
                }
                result.append(arr[i]);
                result.append(",");
            }

        }

        return result.deleteCharAt(result.length() - 1).toString();
    }
}
