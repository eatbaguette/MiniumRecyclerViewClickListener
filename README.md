# 概要
Adapterにリスナーを設置してActivityで処理をする。  
参考URL(https://www.raywenderlich.com/168916/android-an-introduction-to-material-design)

# 手順
## Adapter側
1. プロパティに itemClickListener を追加(Adapter.OnItemClickListenerでは無いので注意)  
2. interface OnItemClickListener を追加  
3. fun setOnItemClickListener を追加  
4. inner class viewHolder に View.OnClickListener をextend  
5. inner class viewHolder にsetOnClickListener を追加  
6. inner class viewHolder に override fun onClick を追加  

## Activity
1. private val onItemClickListener を追加  
2. adapter.setOnItemClickListener を追加  



