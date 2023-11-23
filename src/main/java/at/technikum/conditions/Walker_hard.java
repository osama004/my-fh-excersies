package at.technikum.conditions;
import java.util.Scanner;
public class Walker_hard {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int input = 0;
            int countValidMoves = 0;
            int xRow = 10, xCol = 1;
            printMap(xRow, xCol);

            while (true) {
                System.out.print("\nEingabe: ");
                input = sc.nextInt();
                if (input != 2 && input != 4 && input != 5
                   && input != 6 && input != 8) {
                    System.out.println("Unbekannte Aktion!");
                    printMap(xRow, xCol);
                    continue;
                }
                if (input == 5) {
                    break;
                }
                if (xRow == 1 || xRow == 10 || xCol == 1 || xCol == 10) {
                    if (xRow == 1) {
                        if (input == 8) {
                            System.out.println("Aktion unmoeglich!");
                            printMap(xRow, xCol);
                            continue;
                        }
                        if (xCol == 1) {
                            if (input == 4) {
                                System.out.println("Aktion unmoeglich!");
                            } else {
                                countValidMoves++;
                                if (input == 2) {
                                    xRow++;
                                } else if (input == 6) {
                                    xCol++;
                                }
                            }
                        } else if (xCol == 10) {
                            if (input == 6) {
                                System.out.println("Aktion unmoeglich!");
                            } else {
                                countValidMoves++;
                                if (input == 2) {
                                    xRow++;
                                } else if (input == 4) {
                                    xCol++;
                                }
                            }
                        } else {
                            countValidMoves++;
                            if (input == 2) {
                                xRow++;
                            } else if (input == 4) {
                                xCol--;
                            } else if (input == 6) {
                                xCol++;
                            }
                        }
                    } else if (xRow == 10) {
                        if (input == 2) {
                            System.out.println("Aktion unmoeglich!");
                            printMap(xRow, xCol);
                            continue;
                        }
                        if (xCol == 1) {
                            if (input == 4) {
                                System.out.println("Aktion unmoeglich!");
                            } else {
                                countValidMoves++;
                                if (input == 8) {
                                    xRow--;
                                } else if (input == 6) {
                                    xCol++;
                                }
                            }
                        } else if (xCol == 10) {
                            if (input == 6) {
                                System.out.println("Aktion unmoeglich!");
                            } else {
                                countValidMoves++;
                                if (input == 8) {
                                    xRow--;
                                } else if (input == 4) {
                                    xCol--;
                                }
                            }
                        } else {
                            countValidMoves++;
                            if (input == 8) {
                                xRow--;
                            } else if (input == 4) {
                                xCol--;
                            } else if (input == 6) {
                                xCol++;
                            }
                        }
                    } else if (xCol == 1) {
                        if (input == 4) {
                            System.out.println("Aktion unmoeglich!");
                        } else {
                            countValidMoves++;
                            if (input == 2) {
                                xRow++;
                            } else if (input == 8) {
                                xRow--;
                            } else if (input == 6) {
                                xCol++;
                            }
                        }
                    } else if (xCol == 10) {
                        if (input == 6) {
                            System.out.println("Aktion unmoeglich!");
                        } else {
                            countValidMoves++;
                            if (input == 2) {
                                xRow++;
                            } else if (input == 8) {
                                xRow--;
                            } else if (input == 4) {
                                xCol--;
                            }
                        }
                    }
                } else {
                    countValidMoves++;
                    if (input == 2)
                        xRow++;
                    else if (input == 4)
                        xCol--;
                    else if (input == 6)
                        xCol++;
                    else xRow--;
                }
                printMap(xRow, xCol);
            }
            System.out.printf("Schritte insgesamt: %d\n", countValidMoves);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }

    private static int moveRight(int xCol) {
        if (xCol == 10) {
            System.out.println("Aktion unmoeglich!");
            return xCol;
        }
        xCol++;
        return xCol;
    }


    private static void printMap(int xRow, int xCol) {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10 ;col++) {
                if (row == xRow & col == xCol)
                    System.out.print("X");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}
