package com.eb.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.eb.viewpager2.databinding.FragmentWithoutTabLayoutBinding


class WithoutTabLayoutFragment : Fragment() {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: PagerAdapter
    private lateinit var binding: FragmentWithoutTabLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentWithoutTabLayoutBinding.inflate(inflater, container, false)

        adapter = PagerAdapter(childFragmentManager, lifecycle)
        viewPager = binding.viewPager
        viewPager.adapter = adapter

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> showToast("Birinci Sayfa Seçildi")
                    1 -> showToast("İkinci Sayfa Seçildi")
                    else -> showToast("Bilinmeyen Sayfa Seçildi")
                }
            }
        })
        return binding.root
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }
}