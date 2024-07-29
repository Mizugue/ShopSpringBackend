package com.ecommerce.ecom.service;



import com.ecommerce.ecom.dto.AddressDTO;
import com.ecommerce.ecom.model.User;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);
    List<AddressDTO> getAddresses();
    AddressDTO getAddressesById(Long addressId);
    List<AddressDTO> getUserAddresses(User user);
    AddressDTO updateAddress(Long addressId, AddressDTO addressDTO);
    String deleteAddress(Long addressId);
}

