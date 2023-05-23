/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project1.sortingalgorithmgui;

/**
 *
 * @author REFAEY
 */
import java.util.Arrays;
import javax.swing.JButton;
public class SortAppGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SortAppGUI() {
        initComponents();
    }
    
    
    public int [] selectionSort(int arr[]) {
        int Min;
        for (int i = 0; i < arr.length-1; i++) {
            Min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[Min]){
                    Min = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[Min];
                arr[Min] = temp;
                
            
        }
        return arr;
    }
    public int[] insertionsort(int arr[]) {
        int key, j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i]; // 3
            j = i - 1; // 0
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

     int [] bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
         return arr;
  
    }
     private int[] heapSort(int[] arr) {
    int n = arr.length;

    // Build heap (rearrange array)
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

    // One by one extract an element from heap
    for (int i = n - 1; i > 0; i--) {
        // Move current root to end
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        // call max heapify on the reduced heap
        heapify(arr, i, 0);
    }

    return arr;
}

private void heapify(int[] arr, int n, int i) {
    int largest = i;  // Initialize largest as root
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    // If left child is larger than root
    if (left < n && arr[left] > arr[largest])
        largest = left;

    // If right child is larger than largest so far
    if (right < n && arr[right] > arr[largest])
        largest = right;

    // If largest is not root
    if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;

        // Recursively heapify the affected sub-tree
        heapify(arr, n, largest);
    }
}

     
     public static int[] mergeSort(int[] arr) {
    if (arr == null || arr.length <= 1) {
        // Base case: array is already sorted or empty
        return arr;
    }
    
    int mid = arr.length / 2;
    int[] left = Arrays.copyOfRange(arr, 0, mid);
    int[] right = Arrays.copyOfRange(arr, mid, arr.length);
    
    left = mergeSort(left);
    right = mergeSort(right);
    
    return merge(left, right);
}

private static int[] merge(int[] left, int[] right) {
    int i = 0, j = 0, k = 0;
    int[] arr = new int[left.length + right.length];
    
    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            arr[k++] = left[i++];
        } else {
            arr[k++] = right[j++];
        }
    }
    
    while (i < left.length) {
        arr[k++] = left[i++];
    }
    
    while (j < right.length) {
        arr[k++] = right[j++];
    }
    
    return arr;
}
public int[] quickSort(int[] arr) {
    if (arr.length <= 1) {
        return arr;
    } else {
        int pivot = arr[0];
        int[] left = {};
        int[] right = {};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pivot) {
                left = append(left, arr[i]);
            } else {
                right = append(right, arr[i]);
            }
        }
        return concatenate(quickSort(left), new int[]{pivot}, quickSort(right));
    }
}

public int[] append(int[] arr, int element) {
    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
        newArr[i] = arr[i];
    }
    newArr[arr.length] = element;
    return newArr;
}

public int[] concatenate(int[] arr1, int[] arr2, int[] arr3) {
    int[] arr = new int[arr1.length + arr2.length + arr3.length];
    int pos = 0;
    for (int i = 0; i < arr1.length; i++) {
        arr[pos++] = arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
        arr[pos++] = arr2[i];
    }
    for (int i = 0; i < arr3.length; i++) {
        arr[pos++] = arr3[i];
    }
    return arr;
}
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InsertionSort = new javax.swing.JButton();
        MergeSort = new javax.swing.JButton();
        BubbleSort = new javax.swing.JButton();
        SelectionSort = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtInput6 = new javax.swing.JTextField();
        txtInput8 = new javax.swing.JTextField();
        txtInput7 = new javax.swing.JTextField();
        txtInput9 = new javax.swing.JTextField();
        txtInput10 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtInput1 = new javax.swing.JTextField();
        txtInput2 = new javax.swing.JTextField();
        txtInput3 = new javax.swing.JTextField();
        txtInput4 = new javax.swing.JTextField();
        txtInput5 = new javax.swing.JTextField();
        txtInput0 = new javax.swing.JTextField();
        txtInput11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        InsertionSort.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        InsertionSort.setText("Insertion");
        InsertionSort.setBorder(null);
        InsertionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertionSortActionPerformed(evt);
            }
        });

        MergeSort.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        MergeSort.setText("Merge");
        MergeSort.setBorder(null);
        MergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MergeSortActionPerformed(evt);
            }
        });

        BubbleSort.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        BubbleSort.setText("Bubble");
        BubbleSort.setBorder(null);
        BubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BubbleSortActionPerformed(evt);
            }
        });

        SelectionSort.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        SelectionSort.setText("Selection");
        SelectionSort.setBorder(null);
        SelectionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionSortActionPerformed(evt);
            }
        });

        jLabel4.setText("Output");

        txtInput6.setForeground(new java.awt.Color(255, 255, 255));
        txtInput6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput6ActionPerformed(evt);
            }
        });

        txtInput8.setForeground(new java.awt.Color(255, 255, 255));
        txtInput8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput8ActionPerformed(evt);
            }
        });

        txtInput7.setForeground(new java.awt.Color(255, 255, 255));
        txtInput7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput7ActionPerformed(evt);
            }
        });

        txtInput9.setForeground(new java.awt.Color(255, 255, 255));
        txtInput9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput9ActionPerformed(evt);
            }
        });

        txtInput10.setForeground(new java.awt.Color(255, 255, 255));
        txtInput10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput10ActionPerformed(evt);
            }
        });

        jLabel2.setText("Please Enter the Array :");

        txtInput1.setForeground(new java.awt.Color(255, 255, 255));
        txtInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput1ActionPerformed(evt);
            }
        });

        txtInput2.setForeground(new java.awt.Color(255, 255, 255));
        txtInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput2ActionPerformed(evt);
            }
        });

        txtInput3.setForeground(new java.awt.Color(255, 255, 255));
        txtInput3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput3ActionPerformed(evt);
            }
        });

        txtInput4.setForeground(new java.awt.Color(255, 255, 255));
        txtInput4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput4ActionPerformed(evt);
            }
        });

        txtInput5.setForeground(new java.awt.Color(255, 255, 255));
        txtInput5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        txtInput0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput0ActionPerformed(evt);
            }
        });

        txtInput11.setForeground(new java.awt.Color(255, 255, 255));
        txtInput11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InsertionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MergeSort, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BubbleSort, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtInput11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InsertionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(MergeSort, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(BubbleSort, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(SelectionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(txtInput0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInput6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInput8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInput7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInput9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInput10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInput11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtInput11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput11ActionPerformed

    private void txtInput10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput10ActionPerformed

    private void txtInput9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput9ActionPerformed

    private void txtInput8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput8ActionPerformed

    private void txtInput7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput7ActionPerformed

    private void txtInput6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput6ActionPerformed

    private void txtInput5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput5ActionPerformed

    private void txtInput4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput4ActionPerformed

    private void txtInput3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput3ActionPerformed

    private void txtInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput2ActionPerformed

    private void txtInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput1ActionPerformed

    private void txtInput0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput0ActionPerformed

    }//GEN-LAST:event_txtInput0ActionPerformed

    private void MergeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MergeSortActionPerformed
        int x1 = Integer.parseInt(txtInput0.getText());
        int x2 = Integer.parseInt(txtInput1.getText());
        int x3 = Integer.parseInt(txtInput2.getText());
        int x4 = Integer.parseInt(txtInput3.getText());
        int x5 = Integer.parseInt(txtInput4.getText());
        int x6 = Integer.parseInt(txtInput5.getText());
        int arr[] = {x1,x2,x3,x4,x5,x6};
        int arr1 [] = mergeSort(arr);

        txtInput6.setText(String.valueOf(arr1[0]));
        txtInput7.setText(String.valueOf(arr1[1]));
        txtInput8.setText(String.valueOf(arr1[2]));
        txtInput9.setText(String.valueOf(arr1[3]));
        txtInput10.setText(String.valueOf(arr1[4]));
        txtInput11.setText(String.valueOf(arr1[5]));
    }//GEN-LAST:event_MergeSortActionPerformed

    private void BubbleSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BubbleSortActionPerformed
        int x1 = Integer.parseInt(txtInput0.getText());
        int x2 = Integer.parseInt(txtInput1.getText());
        int x3 = Integer.parseInt(txtInput2.getText());
        int x4 = Integer.parseInt(txtInput3.getText());
        int x5 = Integer.parseInt(txtInput4.getText());
        int x6 = Integer.parseInt(txtInput5.getText());
        int arr[] = {x1,x2,x3,x4,x5,x6};
        int arr1 [] = bubbleSort(arr);

        txtInput6.setText(String.valueOf(arr1[0]));
        txtInput7.setText(String.valueOf(arr1[1]));
        txtInput8.setText(String.valueOf(arr1[2]));
        txtInput9.setText(String.valueOf(arr1[3]));
        txtInput10.setText(String.valueOf(arr1[4]));
        txtInput11.setText(String.valueOf(arr1[5]));
    }//GEN-LAST:event_BubbleSortActionPerformed

    private void InsertionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertionSortActionPerformed
        int x1 = Integer.parseInt(txtInput0.getText());
        int x2 = Integer.parseInt(txtInput1.getText());
        int x3 = Integer.parseInt(txtInput2.getText());
        int x4 = Integer.parseInt(txtInput3.getText());
        int x5 = Integer.parseInt(txtInput4.getText());
        int x6 = Integer.parseInt(txtInput5.getText());
        int arr[] = {x1,x2,x3,x4,x5,x6};
        int arr1 [] = insertionsort(arr);

        txtInput6.setText(String.valueOf(arr1[0]));
        txtInput7.setText(String.valueOf(arr1[1]));
        txtInput8.setText(String.valueOf(arr1[2]));
        txtInput9.setText(String.valueOf(arr1[3]));
        txtInput10.setText(String.valueOf(arr1[4]));
        txtInput11.setText(String.valueOf(arr1[5]));
    }//GEN-LAST:event_InsertionSortActionPerformed

    private void SelectionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionSortActionPerformed
        // TODO add your handling code here:
        int x1 = Integer.parseInt(txtInput0.getText());
        int x2 = Integer.parseInt(txtInput1.getText());
        int x3 = Integer.parseInt(txtInput2.getText());
        int x4 = Integer.parseInt(txtInput3.getText());
        int x5 = Integer.parseInt(txtInput4.getText());
        int x6 = Integer.parseInt(txtInput5.getText());
        int arr[] = {x1,x2,x3,x4,x5,x6};
        int arr1 [] = selectionSort(arr);

        txtInput6.setText(String.valueOf(arr1[0]));
        txtInput7.setText(String.valueOf(arr1[1]));
        txtInput8.setText(String.valueOf(arr1[2]));
        txtInput9.setText(String.valueOf(arr1[3]));
        txtInput10.setText(String.valueOf(arr1[4]));
        txtInput11.setText(String.valueOf(arr1[5]));
    }//GEN-LAST:event_SelectionSortActionPerformed
    private void HeapSortActionPerformed(java.awt.event.ActionEvent evt) {
    int x1 = Integer.parseInt(txtInput0.getText());
    int x2 = Integer.parseInt(txtInput1.getText());
    int x3 = Integer.parseInt(txtInput2.getText());
    int x4 = Integer.parseInt(txtInput3.getText());
    int x5 = Integer.parseInt(txtInput4.getText());
    int x6 = Integer.parseInt(txtInput5.getText());
    int arr[] = {x1, x2, x3, x4, x5, x6};
    int arr1[] = heapSort(arr);

    txtInput6.setText(String.valueOf(arr1[0]));
    txtInput7.setText(String.valueOf(arr1[1]));
    txtInput8.setText(String.valueOf(arr1[2]));
    txtInput9.setText(String.valueOf(arr1[3]));
    txtInput10.setText(String.valueOf(arr1[4]));
    txtInput11.setText(String.valueOf(arr1[5]));
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SortAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortAppGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BubbleSort;
    private javax.swing.JButton InsertionSort;
    private javax.swing.JButton MergeSort;
    private javax.swing.JButton SelectionSort;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtInput0;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput10;
    private javax.swing.JTextField txtInput11;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtInput3;
    private javax.swing.JTextField txtInput4;
    private javax.swing.JTextField txtInput5;
    private javax.swing.JTextField txtInput6;
    private javax.swing.JTextField txtInput7;
    private javax.swing.JTextField txtInput8;
    private javax.swing.JTextField txtInput9;
    // End of variables declaration//GEN-END:variables
}
