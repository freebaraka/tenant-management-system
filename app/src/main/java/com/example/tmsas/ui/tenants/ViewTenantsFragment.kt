package com.example.tmsas.ui.tenants

import android.content.Intent
import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.tmsas.data.repository.TenantRepository
import com.example.tmsas.databinding.FragmentViewTenantsBinding

class ViewTenantsFragment : Fragment() {
    private var _binding: FragmentViewTenantsBinding? = null
    private val binding get() = _binding!!
    private val args: ViewTenantsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewTenantsBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val newTenant = args.newTenant
        binding.tenant = newTenant
        if (newTenant == null) {
            binding.newTenantGroup.visibility = View.GONE
        }
        binding.callButton.setOnClickListener {
            if (newTenant != null) {
                val intent = Intent(Intent.ACTION_DIAL, parse("tel:${newTenant.phone}"))
                startActivity(intent)
            }
        }
        val tenants = TenantRepository.tenants
        if (tenants.isEmpty()) {
            binding.allTenantsTextView.text = "No tenants yet. Add one from the Dashboard."
        } else {
            binding.allTenantsTextView.text = tenants.joinToString("\n\n") { it.summary() }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}