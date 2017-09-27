package com.list_sample.minimumrecyclerview.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.list_sample.minimumrecyclerview.R
import com.list_sample.minimumrecyclerview.model.Items

/**
 * Created by monkey on 2017/09/26.
 */
class RecyclerViewAdapter(private val itemList: List<Items>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    lateinit var itemClickListener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(view: View, position: Int)
    }

    fun setOnItemclickListenr(itemClickListener: OnItemClickListener) {
        this.itemClickListener = itemClickListener
    }

    // ViewHolder
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view), View.OnClickListener {

        init {
            view.setOnClickListener(this)
        }

        var cellText: TextView = view.findViewById<TextView>(R.id.recycler_view_cell_text)

        override fun onClick(view: View) {
            itemClickListener.onItemClick(itemView, adapterPosition)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder{
        val itemView = LayoutInflater.from(parent?.context)
                .inflate(R.layout.recycler_view_cell, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val item = itemList[position]
        holder?.cellText?.text = item.cellText
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}