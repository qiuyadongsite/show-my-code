package com.qyd.learn.show.algorithm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/5 14:19
 * @Description:
 */
public class SearchBinaryTree {

    class SearchBinaryTreeNode{
        int index;
        int data;
        SearchBinaryTreeNode left;
        SearchBinaryTreeNode right;
        SearchBinaryTreeNode parent;

        public SearchBinaryTreeNode(int index, int data) {
            this.index = index;
            this.data = data;
        }
    }

    public static void main(String[] args) {
        SearchBinaryTree tree=new SearchBinaryTree();
        int[] datas=new int[]{6,3,14,10,16,9,13,11,12};
        List<Integer> list= new ArrayList<>();
        for(int i:datas){
            list.add(i);
        }

        SearchBinaryTreeNode node=tree.creatASearchTree(list);



        //删除一个

        int data=1;
        if(data==node.data){
           node= tree.deletRootNode(node);
        }else{
            tree.deletANode(data,node);
        }


        tree.midLoad(node);


    }

    private SearchBinaryTreeNode deletRootNode(SearchBinaryTreeNode node) {
        SearchBinaryTreeNode riht=node.right;
        SearchBinaryTreeNode nodet=findeReplace(riht);
        nodet.left=node.left;
        if(nodet!=riht){
            SearchBinaryTreeNode replaceP=nodet.parent;
            replaceP.left=nodet.right==null?null:nodet.right;
            nodet.right = node.right;
        }

        nodet.parent=null;
        return nodet;
    }

    private void deletANode(int data,SearchBinaryTreeNode node) {

        //先查出来

        if(data==node.data){
            if(node.left==null&&node.right==null){

                if(node.parent==null){
                    node=null;
                }else{
                    if(data<node.parent.data){
                        node.parent.left=null;
                    }
                    if(data>node.parent.data){
                        node.parent.right=null;
                    }
                }
            }
            if(node.left==null){

                if(data<node.parent.data){
                    node.parent.left=node.right;
                }
                if(data>node.parent.data){
                    node.parent.right=node.right;
                }
            }else if(node.right ==null){
                if(data<node.parent.data){
                    node.parent.left=node.left;
                }
                if(data>node.parent.data){
                    node.parent.right=node.left;
                }
            }else{
                SearchBinaryTreeNode riht=node.right;
                SearchBinaryTreeNode nodet=findeReplace(riht);
                if(nodet!=riht){
                    SearchBinaryTreeNode replaceP=nodet.parent;
                    replaceP.left=nodet.right==null?null:nodet.right;
                }


                    //它有左子树也有右子树
                    if(data<node.parent.data){
                        //它是它父亲的左边



                        node.parent.left=nodet;

                    }
                    if(data>node.parent.data){
                        //它是它父亲的右边

                        node.parent.right=nodet;

                    }


                nodet.left=node.left;
                if(nodet!=riht) {
                    nodet.right = node.right;
                }

            }

        }else if(data<node.data){
            if(node.left!=null){
                deletANode(data,node.left);
            }else{
                System.out.println("没有该数据！");
            }

        }else{
            if(node.right!=null){
            deletANode(data,node.right);}else{
                System.out.println("没有该数据！");
            }
        }

    }

    private SearchBinaryTreeNode findeReplace(SearchBinaryTreeNode right) {

        SearchBinaryTreeNode node=right;
        while (node.left!=null){
            node=node.left;
        }
         return node;

    }

    private void midLoad(SearchBinaryTreeNode node) {
        if(node==null){
            return;
        }
        if (node!=null){
            midLoad(node.left);
            System.out.println("min load:"+node.data);
            midLoad(node.right);
        }
    }

    private SearchBinaryTreeNode creatASearchTree(List<Integer> list) {
        SearchBinaryTreeNode node=null;
        if(list.isEmpty()){
            return node;
        }
        node=new SearchBinaryTreeNode(list.get(0),list.get(0));

        for(int i=1;i<list.size();i++){
            insertSearchTree(list.get(i),node);
        }

        return node;
    }

    private void insertSearchTree(Integer data, SearchBinaryTreeNode node) {

        SearchBinaryTreeNode tem=new SearchBinaryTreeNode(data,data);

        if (node!=null){
            if(data<node.data){
                if(node.left!=null){
                    insertSearchTree(data,node.left);
                }else{
                    node.left=tem;
                    tem.parent=node;
                    return;
                }
            }else if(data>node.data){
                if(node.right==null){
                    node.right=tem;
                    tem.parent=node;
                    return;
                }else{
                    insertSearchTree(data,node.right);
                }

            }else{
                return;
            }
        }


    }

}
