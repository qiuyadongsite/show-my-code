package com.qyd.learn.show.algorithm.tree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/4 15:00
 * @Description:
 */
public class BinaryTreeDemo {

    public static BinaryTreeNode root;

    public class BinaryTreeNode{
        private int index;

        private String data;

        private BinaryTreeNode leftNode;

        private BinaryTreeNode rightNode;

        public BinaryTreeNode(int index, String data) {
            this.index = index;
            this.data = data;
        }
    }

    BinaryTreeDemo(){
        root= new BinaryTreeNode(1,"A");
    }
    /**
     *           A
     *      B          C
     * D        E    G      F
     *
     */
    private void createBinaryTree(){
        BinaryTreeNode B= new BinaryTreeNode(2,"B");
        BinaryTreeNode C= new BinaryTreeNode(3,"C");
        BinaryTreeNode D= new BinaryTreeNode(4,"D");
        BinaryTreeNode E= new BinaryTreeNode(5,"E");
        BinaryTreeNode F= new BinaryTreeNode(6,"F");
        BinaryTreeNode G= new BinaryTreeNode(7,"G");

        root.leftNode=B;
        root.rightNode=C;
        B.leftNode=D;
        B.rightNode=E;
        C.rightNode=F;
        C.leftNode=G;

    }

    /**
     * 获取树的高度
     * @param
     */
    public int getHight(BinaryTreeNode node){
        if(node==null){
            return 0;
        }else{
            int i=getHight(node.leftNode);
            int j=getHight(node.rightNode);
            return (i<j)?j+1:i+1;
        }

    }
    /**
     *           A
     *      B          C
     * D        E    G      F
     *
     */
    /**
     * 遍历  前序遍历 中-左-右  a b d e c f
     * @param node
     */

    public void preLoadTree(BinaryTreeNode node){
        if(node==null){
            return;
        }else{
            System.out.println("前序遍历："+node.data);
            preLoadTree(node.leftNode);
            preLoadTree(node.rightNode);
        }
    }

    public void nonPreLoadTree(BinaryTreeNode node){

        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            BinaryTreeNode tem= stack.pop();
            if(tem.rightNode!=null){
                stack.push(tem.rightNode);
            }

            if(tem.leftNode!=null){
                stack.push(tem.leftNode);
            }

            System.out.println("non pre:"+tem.data);

        }

    }

//中 - 左 - 右
    public void nonpre(BinaryTreeNode node){
        Stack<BinaryTreeNode> stack=new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            BinaryTreeNode pop = stack.pop();
            System.out.println("non pre: "+ pop.data);

            if(pop.rightNode!=null){
                stack.push(pop.rightNode);
            }
            if(pop.leftNode!=null){
                stack.push(pop.leftNode);
            }
        }
    }
    /**
     * 中序调用 左- 中 - 右 D b e a c f
     * @param node
     */
    public void midLoadTree(BinaryTreeNode node){
        if(node==null){
            return;
        }else{
            midLoadTree(node.leftNode);

            System.out.println("中序遍历："+node.data);

            midLoadTree(node.rightNode);
        }
    }

    public void nonMidLoadTree(BinaryTreeNode node){
        Stack<BinaryTreeNode> stack=new Stack<>();

        stack.push(node);

        BinaryTreeNode cur=node;


        while(!stack.isEmpty()||cur!=null){

            while(cur!=null){
                stack.push(cur);
                cur=cur.leftNode;
            }
            cur=stack.pop();
            System.out.println("non mid:"+cur.data);
            cur =cur.rightNode;

        }
    }

    public void nonMid(BinaryTreeNode node){

        Stack<BinaryTreeNode> stack =new Stack<>();

        BinaryTreeNode n=node;

        while (!stack.isEmpty()||n!=null){
            while (n!=null){
                stack.push(n);
                n=n.leftNode;
            }

            n=stack.pop();

            System.out.println("none mid: "+n.data);

            n=n.rightNode;


        }


    }
    /**
     * 后序调用 左 - 右 - 中  d b e f c a
     * @param node
     */
    public void afterLoadTree(BinaryTreeNode node){
        if(node==null){
            return;
        }else{
            afterLoadTree(node.leftNode);

            afterLoadTree(node.rightNode);

            System.out.println("后序遍历："+node.data);
        }
    }

    public void nonAfterLoadTree(BinaryTreeNode node){
        Stack<BinaryTreeNode> stack=new Stack<>();

        BinaryTreeNode cur=node;
        BinaryTreeNode pre=null;

        while (cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur= cur.leftNode;
            }
             cur=stack.peek();

             if(cur.rightNode==null||cur.rightNode==pre){
                 stack.pop();
                 System.out.println("non after:"+ cur.data);

                 pre=cur;
                 cur=null;

             }else{

                 cur=cur.rightNode;
             }


        }

    }

    public void nonAfter(BinaryTreeNode node){

        Stack<BinaryTreeNode> stack=new Stack<>();
        BinaryTreeNode cur=node;
        BinaryTreeNode pre=null;

        while (!stack.isEmpty()||cur!=null){

            while(cur!=null){
                stack.push(cur);
                cur=cur.leftNode;

            }


            cur= stack.peek();

            if(cur.rightNode==null||cur.rightNode==pre){
                stack.pop();
                System.out.println("non  after:"+ cur.data);
                pre=cur;
                cur=null;
            }else{
                cur=cur.rightNode;
            }

        }

    }

    public static void main(String[] args) {
        BinaryTreeDemo binaryTreeDemo=new BinaryTreeDemo();
        binaryTreeDemo.createBinaryTree();

        System.out.println("binary tree hight:"+binaryTreeDemo.getHight(root));

        /*binaryTreeDemo.preLoadTree(root);*/

       /* binaryTreeDemo.midLoadTree(root); */

       /* binaryTreeDemo.afterLoadTree(root);*/
        /*binaryTreeDemo.nonPreLoadTree(root);*/
        binaryTreeDemo.nonAfterLoad(root);
    }
    /**
     *     A
     *  B     C
     D    E  G    F
     */

    //非迭代后序调用

    public void nonAfterLoad(BinaryTreeNode node){

        Stack<BinaryTreeNode> stack = new Stack<>();

        BinaryTreeNode cur=node;
        BinaryTreeNode pre= null;

        while (!stack.isEmpty()||cur!=null){

            while (cur!=null){
                stack.push(cur);
                cur = cur.leftNode;
            }

            cur=stack.peek();

            if(cur.rightNode==null||cur.rightNode==pre){
                stack.pop();
                System.out.println("non after load:"+ cur.data);

                pre= cur;
                cur=null;
            }else{
                cur=cur.rightNode;
            }

        }
    }

    //非迭代中序调用
    public void nonMidLoad(BinaryTreeNode node){

        Stack<BinaryTreeNode> stack=new Stack<>();
        BinaryTreeNode cur = node;

        while (!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.leftNode;
            }
            cur= stack.pop();
            System.out.println("non mid load:"+cur.data);

            cur= cur.rightNode;
        }
    }

    //非迭代前序调用

    public void nonPreLoad(BinaryTreeNode node){

        Stack<BinaryTreeNode> stack=new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()){
            node=stack.pop();
            System.out.println("non pre load:"+node.data);

            if(node.rightNode!=null){
                stack.push(node.rightNode);
            }

            if(node.leftNode!=null){
                stack.push(node.leftNode);
            }
        }


    }
}
