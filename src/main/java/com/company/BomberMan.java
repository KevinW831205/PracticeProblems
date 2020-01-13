package com.company;

public class BomberMan {

    static String[] bomberMan(int n, String[] grid) {
        String[] result = new String[grid.length];
        for (int i = 0; i < grid.length; i++) {
            String row = "";
            for (int j = 0; j < grid[i].length(); j++) {
                row += "O";
            }
            result[i] = row;
        }
        if (n == 1) {
            return grid;
        } else if (n % 2 == 0) {
            return result;
        } else {
            String[] grid2SecAgo = bomberMan(n - 2, grid);
            for (int i = 0; i < grid2SecAgo.length; i++) {
//                System.out.println("at i" + i);
//                System.out.println("bp: " + grid2SecAgo[0]);
//                System.out.println("before: " + result[0]);
                for (int j = 0; j < grid2SecAgo[i].length(); j++) {
                    if (grid2SecAgo[i].charAt(j) == 'O') {
                        if (j == 0 && i == 0) {
                            result[i] = ".." + result[i].substring(2);
                            result[i + 1] = "." + result[i + 1].substring(1);
                        } else if (i == 0 && j == grid2SecAgo[i].length() - 1) {
                            result[i] = result[i].substring(0, result[i].length() - 2) + "..";
                            result[i + 1] = result[i + 1].substring(0, result[i + 1].length() - 1) + ".";
                        } else if (i == result.length - 1 && j == 0) {
                            result[i] = ".." + result[i].substring(2);
                            result[i - 1] = "." + result[i - 1].substring(1);
                        } else if (i == result.length - 1 && j == grid2SecAgo[i].length() - 1) {
                            result[i] = result[i].substring(0, result[i].length() - 2) + "..";
                            result[i - 1] = result[i - 1].substring(0, result[i - 1].length() - 1) + ".";
                        } else if (i == 0) {
                            result[i] = result[i].substring(0, j - 1) + "..." + result[i].substring(j + 2);
                            result[i + 1] = result[i + 1].substring(0, j) + "." + result[i + 1].substring(j + 1);
                        } else if (j == 0) {
                            result[i] = ".." + result[i].substring(2);
                            result[i + 1] = "." + result[i + 1].substring(1);
                            result[i - 1] = "." + result[i - 1].substring(1);
                        } else if (i == result.length - 1) {
                            result[i] = result[i].substring(0, j - 1) + "..." + result[i].substring(j + 2);
                            result[i - 1] = result[i - 1].substring(0, j) + "." + result[i - 1].substring(j + 1);
                        } else if (j == grid2SecAgo[i].length() - 1) {
                            result[i] = result[i].substring(0, j - 1) + "..";
                            result[i + 1] = result[i + 1].substring(0, j) + ".";
                            result[i - 1] = result[i - 1].substring(0, j) + ".";
                        } else {
                            result[i] = result[i].substring(0, j - 1) + "..." + result[i].substring(j + 2);
                            result[i + 1] = result[i + 1].substring(0, j) + "." + result[i + 1].substring(j + 1);
                            result[i - 1] = result[i - 1].substring(0, j) + "." + result[i - 1].substring(j + 1);
                        }
                    }
//                    if (i == 0) {
//                        System.out.println("j" + j + " " + result[0]);
//                    }
                }
//                System.out.println("after: " + result[0]);

//                for(String s : result){
//                    System.out.println(s);
//                }
            }
//            System.out.println("sec = " + n);
//            for (String s : result) {
//                System.out.println(s);
//            }
            return result;
        }
    }

    // someone elses solution
    /*
    static String[] bomberMan(int n, String[] grid) {
        String[] ans = new String[grid.length];
        int aa = grid[0].length();
        String ab = "";
        //String[] grd = new String(grid.length);
        for(int i=0;i<aa;i++){
            ab = ab.concat("O");
        }

        if(n%2 == 0){
            for(int i=0;i<grid.length;i++){
                ans[i] = ab;
            }
        }
        else{
            if(n==1){
                ans = grid;
            }
            else{
                int count = 0;
                while(count<2){
                    for(int i=0;i<grid.length;i++){
                        char[] tmp1 = grid[i].toCharArray();
                        for(int j=0;j<aa;j++){
                            if(tmp1[j] == 'O'){
                                tmp1[j] = '1';
                            }
                            else if(tmp1[j] == '.'){
                                tmp1[j] = 'O';
                            }
                        }
                        String ala = new String(tmp1);
                        grid[i]=ala;
                    }
                    int flag = 0;
                    int flag1 = 0;
                    for(int i=0;i<grid.length;i++){
                        char[] tmp = grid[i].toCharArray();
                        char[] tm2 = grid[i].toCharArray();
                        char[] tm3 = grid[i].toCharArray();
                        if(i-1 != -1){
                            tm2 = grid[i-1].toCharArray();
                        }
                        else{
                            flag = 1;
                        }
                        if(i+1 != grid.length){
                            tm3 = grid[i+1].toCharArray();
                        }
                        else{
                            flag1 = 1;
                        }
                        for(int j=0;j<aa;j++){
                            if(flag == 0 && flag1 == 0){
                                if(tmp[j] == '1'){
                                    tmp[j] = '.';
                                    if(j!=0){
                                        tmp[j-1] = '.';
                                    }
                                    if(j!=tmp.length-1){
                                        if(tmp[j+1] == 'O'){
                                            tmp[j+1] = '.';
                                        }
                                    }
                                    if(tm3[j] == 'O'){
                                        tm3[j] = '.';
                                    }
                                    if(tm2[j] == 'O'){
                                        tm2[j] = '.';
                                    }
                                }
                            }
                            else if(flag == 1 && flag1 == 0){
                                //flag = 0;
                                if(tmp[j] == '1'){
                                    tmp[j]='.';
                                    if(j!=0){
                                        tmp[j-1] = '.';
                                    }
                                    if(j!=tmp.length-1){
                                        if(tmp[j+1] == 'O'){
                                            tmp[j+1] = '.';
                                        }
                                    }
                                    if(tm3[j] == 'O'){
                                        tm3[j] = '.';
                                    }
                                }
                            }
                            else if(flag1 == 1 && flag == 0){
                                //flag1 = 0;
                                if(tmp[j] == '1'){
                                    tmp[j]='.';
                                    if(j!=0){
                                        tmp[j-1] = '.';
                                    }
                                    if(j!=tmp.length-1){
                                        if(tmp[j+1] == 'O'){
                                            tmp[j+1] = '.';
                                        }
                                    }
                                    if(tm2[j] == 'O'){
                                        tm2[j] = '.';
                                    }
                                }
                            }
                            else{
                                if(tmp[j] == '1'){
                                    tmp[j]='.';
                                    if(j!=0){
                                        tmp[j-1] = '.';
                                    }
                                    if(j!=tmp.length-1){
                                        if(tmp[j+1] == 'O'){
                                            tmp[j+1] = '.';
                                        }
                                    }
                                }
                            }
                        }
                        String a3 = new String(tmp);
                        grid[i] = a3;
                        if(flag == 0 && flag1 == 0){
                            String a1 = new String(tm2);
                            String a2 = new String(tm3);
                            grid[i-1] = a1;
                            grid[i+1] = a2;
                        }
                        else if(flag == 1 && flag1 == 0){
                            //String a1 = new String(tm2);
                            String a2 = new String(tm3);
                            grid[i+1] = a2;
                            flag = 0;
                        }
                        else if(flag == 0 && flag1 == 1){
                            String a1 = new String(tm2);
                            //String a2 = new String(tm3);
                            grid[i-1] = a1;
                            flag1 = 0;
                        }
                    }
                    count++;
                    ans = grid;
                    if((n+1)%4==0){
                        //grd = grid;
                        break;
                    }
                }
            }
        }
        return(ans);
    }

     */
}

