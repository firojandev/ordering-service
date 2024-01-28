package com.experiment.order.modules.products;

import com.experiment.order.common.Constants;
import com.experiment.order.modules.PageWrapper;
import com.experiment.order.modules.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/products/")
public class ProductController {

    @Autowired
    ProductServiceImpl mProductServiceImpl;

    @RequestMapping("findAll")
    public ResponseWrapper<?,Product> all(){

        ResponseWrapper<?,Product> responseWrapper = new ResponseWrapper<>();

        responseWrapper.status = HttpStatus.OK.value();
        responseWrapper.message = Constants.SUCCESSFUL_FETCH;
        responseWrapper.datas = mProductServiceImpl.findAll();

        return responseWrapper;
    }

    @RequestMapping("findByPage")
    public ResponseWrapper<PageWrapper, Product> get(@RequestParam(defaultValue = "20") int size, @RequestParam(defaultValue = "0") int page) {

        ResponseWrapper<PageWrapper,Product> responseWrapper = new ResponseWrapper<>();

        responseWrapper.status = HttpStatus.OK.value();
        responseWrapper.message = Constants.SUCCESSFUL_FETCH;

        Page<Product> mPage = mProductServiceImpl.findByPage(page, size);

        PageWrapper myPage = new PageWrapper();
        myPage.setTotalPage(mPage.getTotalPages());
        myPage.setTotalRecord(mPage.getTotalElements());

        responseWrapper.data = myPage;
        responseWrapper.datas = mPage.getContent();

        return responseWrapper;
    }
}
