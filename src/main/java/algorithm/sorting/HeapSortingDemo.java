/*********************************************************************
 * The Initial Developer of the content of this file is NETCONOMY.
 * All portions of the code written by NETCONOMY are property of
 * NETCONOMY. All Rights Reserved.
 *
 * NETCONOMY Software & Consulting GmbH
 * Hilmgasse 4, A-8010 Graz (Austria)
 * FN 204360 f, Landesgericht fuer ZRS Graz
 * Tel: +43 (316) 815 544
 * Fax: +43 (316) 815544-99
 * www.netconomy.net
 *
 * (c) 2021 by NETCONOMY Software & Consulting GmbH
 *********************************************************************/

package algorithm.sorting;

public class HeapSortingDemo extends SortInterface{

    @Override
    public void coreAlorithm(final int[] intArray) {
        int length = intArray.length;
        int temp;
        for (int k = length / 2; k >= 1; k--) {
            sink(intArray, k, length);
        }
        while (length > 0) {
            temp = intArray[0];
            intArray[0] = intArray[length - 1];
            intArray[length - 1] = temp;
            length--;
            sink(intArray, 1, length);
        }
    }

    private static void sink(int[] a, int k, int n) {
        int temp;
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && a[j - 1] < a[j]) {
                j++;
            }
            if (a[k - 1] >= a[j - 1]) {
                break;
            }
            temp = a[k - 1];
            a[k - 1] = a[j - 1];
            a[j - 1] = temp;
            k = j;
        }
    }

    public static void main(String[] args) {

    }
}
