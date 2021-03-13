package com.kevin.note.java.data.structure.sort;

/**
 * 桶排序
 * 核心思想 :将需要排序的数据分别放到几个桶里，在分别将每个桶里的数据进行排序，排序完成后再将每个桶里的数据按照
 * 顺序依次取出，组成的序列就是有序的了。
 * 先决条件：要排序的数据很容易就能划分成m个桶，并且桶与桶之间有着天然的大小顺序。这样每个桶内的数据排序完后，桶
 * 与桶之间的数据就不需要再进行排序了。其次数据再各个桶之间的分布是比较均匀的。
 * 适用场景：比较适合用在外部排序中。所谓外部排序就是数据存储再外部磁盘中，数据量比较大，内存有限，无法将数据全部
 * 加载到内存中。
 *
 * @Author:Kevin
 * @Date:Created in 11:27 2021/3/13
 */
public class BucketSort {
}
