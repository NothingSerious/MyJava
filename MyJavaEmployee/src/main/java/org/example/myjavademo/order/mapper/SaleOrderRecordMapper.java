package org.example.myjavademo.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.myjavademo.order.domain.SaleOrderRecord;

/**
* @author genki
* @description 针对表【sale_order_record(kafka推送销售出库单记录)】的数据库操作Mapper
* @createDate 2024-03-28 15:07:57
* @Entity org.example.myjavademo.order.domain.SaleOrderRecord
*/
public interface SaleOrderRecordMapper extends BaseMapper<SaleOrderRecord> {


}
