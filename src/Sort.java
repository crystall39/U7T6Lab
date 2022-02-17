import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static void selectionSort(int[] elements)
  {
    int runTime = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        runTime++;
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    System.out.println("Run Time: " + runTime);
  }

  // Part A.  Which Sort is Which?
  public static void insertionSort(int[] elements)
  {
    int runTime = 0;
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {
        runTime++;
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
      }
      elements[possibleIndex] = temp;
    }
    System.out.println("Run Time: " + runTime);
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {
    int runTime = 0;
    for (int j = 0; j < words.size() - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < words.size(); k++)
      {
        runTime++;
        if (words.get(k).compareTo(words.get(minIndex)) < 0)
        {
          minIndex = k;
        }
      }
      String temp = words.get(j);
      words.set(j, words.get(minIndex));
      words.set(minIndex, temp);
    }
    System.out.println("Run Time: " + runTime);
  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {
    int runTime = 0;
    for (int j = 1; j < words.size(); j++)
    {
      String temp = words.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(words.get(possibleIndex - 1)) < 0)
      {
        runTime++;
        words.set(possibleIndex, words.get(possibleIndex - 1));
        possibleIndex--;
      }
      words.set(possibleIndex, temp);
    }
    System.out.println("Run Time: " + runTime);
  }
}