package com.pharmacy.Management.services;

import com.pharmacy.Management.models.MailResponse;
import com.pharmacy.Management.models.Supplier;
import com.pharmacy.Management.repository.MailResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private MailResponseRepository mailResponseRepository;

    public void sendSimpleEmail(Supplier supplier, String drugsReq) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(supplier.getSupplierEmail());
        message.setSubject("Drug Request from Pharmacy");
        message.setText("Hello " + supplier.getSupplierName() + ",\n\n" +
                        "We are requesting the following drugs:\n" + drugsReq + "\n\n" +
                        "Please confirm availability.\n\n" +
                        "Regards,\nPharmacy Management");

        mailSender.send(message);

        // Save mail response to database
        MailResponse mailResponse = new MailResponse(
                supplier.getSupplierName(),
                supplier.getSupplierEmail(),
                drugsReq
        );
        mailResponseRepository.save(mailResponse);
    }
}
