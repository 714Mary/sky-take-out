package com.sky.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 员工绩效统计 VO（创新点3）
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePerformanceVO implements Serializable {

    // 员工ID
    private Long employeeId;

    // 员工姓名
    private String employeeName;

    // 处理订单总数
    private Integer totalOrders;

    // 已完成订单数
    private Integer completedOrders;

    // 已取消订单数（拒单+取消）
    private Integer cancelledOrders;

    // 处理订单总金额
    private BigDecimal totalAmount;
}