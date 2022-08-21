package com.shuoxd.charge.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.shuoxd.charge.R
import com.shuoxd.charge.databinding.AddYourChargeBinding
import com.shuoxd.charge.databinding.ChargingItemBinding
import com.shuoxd.charge.databinding.SettingItemViewBinding

class DataItemView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs,defStyleAttr) {

    private lateinit var bingding:ChargingItemBinding



    init {
        val view=LayoutInflater.from(context).inflate(R.layout.charging_item,this)
        bingding = ChargingItemBinding.bind(view)


    }



}