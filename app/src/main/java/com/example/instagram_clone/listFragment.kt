package com.example.instagram_clone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagram_clone.Adapter.RasmAdapter
import com.example.instagram_clone.Adapter.RasmAdapter2
import com.example.instagram_clone.Models.Rasm
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_list.view.*
import kotlinx.android.synthetic.main.item_rv_2.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class listFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    lateinit var root:View
    lateinit var rasmAdapter: RasmAdapter
    lateinit var rasmAdapter2: RasmAdapter2
    lateinit var rasmList:ArrayList<Rasm>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_list, container, false)

        loadData()

        root.rv_1.adapter = rasmAdapter

        root.rv_2.adapter = rasmAdapter2

        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(root.image_profile);


        return root
    }

    private fun loadData() {
        rasmList = ArrayList()

        rasmList.add(Rasm("", "new"))
        rasmList.add(Rasm("", "new"))
        rasmList.add(Rasm("", "new"))
        rasmList.add(Rasm("", "new"))
        rasmList.add(Rasm("", "new"))

        rasmAdapter = RasmAdapter(rasmList)
        rasmAdapter2 = RasmAdapter2(rasmList)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProfileFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            listFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}