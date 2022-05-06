package com.example.corder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerItemAdapter(private val items: ArrayList<ListData>) : RecyclerView.Adapter<RecyclerItemAdapter.ViewHolder>(){

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerItemAdapter.ViewHolder, position: Int) {
        val item = items[position]
        val listener = View.OnClickListener { it ->
            Toast.makeText(it.context, "cName: " + item.cName + " Number: " + item.number, Toast.LENGTH_SHORT).show()
        }
//        holder.apply {
//            bind(listener, item)
//            itemView.tag = item
//        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerItemAdapter.ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return RecyclerItemAdapter.ViewHolder(inflatedView)
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v){
        private var  view: View = v
//        fun bind(listener: View.OnClickListener, item: ListData){
//            view.ivImg.setImageDrawble(item.img)
//            view.tvCname.text = item.cName
//            view.setOnClickListener(listener)
//        }
    }
}




//class RecyclerItemAdapter(private val items: ArrayList<ListData>) : RecyclerView.Adapter<RecyclerItemAdapter.ViewHolder>() {
//
//    // 각 항목에 필요한 기능을 구현
//    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
//        private var view: View = v
//        fun bind(listener: View.OnClickListener, item: ListData) {
//            view.tvCname.text = item.cName
//            view.setOnClickListener(listener)
//        }
//    }
//
//    override fun getItemCount(): Int = items.size
//
//    override fun onBindViewHolder(holder: RecyclerItemAdapter.ViewHolder, position: Int) {
//
//        val item = items[position]
//        val listener = View.OnClickListener { it ->
//            Toast.makeText(it.context, "Clicked -> Img : ${item.img}, Number : ${item.number}, Name : ${item.cName}", Toast.LENGTH_SHORT).show()
//        }
//        holder.apply {
//            bind(listener, item)
//            itemView.tag = item
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
//        return RecyclerItemAdapter.ViewHolder(inflatedView)
//    }
//}