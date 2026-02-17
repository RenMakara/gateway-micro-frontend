package co.istad.makara.iphone.service.impl;


import co.istad.makara.iphone.IphoneResponse;
import co.istad.makara.iphone.repository.IphoneRepository;
import co.istad.makara.iphone.service.IphoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IphoneServiceImpl implements IphoneService {

    private final IphoneRepository iphoneRepository;

    @Override
    public List<IphoneResponse> findAll() {

        return iphoneRepository.findAll().stream()
                .map(pro -> IphoneResponse.builder()
                        .productName(pro.getProductName())
                        .productPrice(pro.getProductPrice())
                        .productDescription(pro.getProductDescription())
                        .productImageUrl(pro.getProductImageUrl())
                        .build())
                .toList();
    }
}
