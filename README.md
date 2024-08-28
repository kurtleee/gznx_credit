## gznx_credit
![example workflow](https://github.com/kurtleee/gznx_credit/actions/workflows/codeql.yml/badge.svg)
![example workflow](https://github.com/kurtleee/gznx_credit/actions/workflows/greetings.yml/badge.svg)
![example workflow](https://github.com/kurtleee/gznx_credit/actions/workflows/label.yml/badge.svg)
![example workflow](https://github.com/kurtleee/gznx_credit/actions/workflows/stale.yml/badge.svg)
![Spring Boot 2.0](https://img.shields.io/badge/Spring%20Boot-2.0-brightgreen.svg)


![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=Swagger&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.5.0-yellowgreen.svg)

![CloudFlare Support](https://img.shields.io/badge/Cloudflare-F38020?style=for-the-badge&logo=Cloudflare&logoColor=white)
![Linode Support](https://img.shields.io/badge/Linode-00A95C?style=for-the-badge&logo=Linode&logoColor=white)
![MQ](https://img.shields.io/badge/rabbitmq-%23FF6600.svg?&style=for-the-badge&logo=rabbitmq&logoColor=white)
![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?&style=for-the-badge&logo=redis&logoColor=white)
### 微服务模块划分方案

1. **Auth-Service（认证服务）**
   - **功能**：处理用户认证、授权、安全管理等功能。
   - **主要职责**：
     - 用户登录、注册
     - JWT 令牌生成与验证
     - 用户角色和权限管理

2. **User-Service（用户管理服务）**
   - **功能**：处理用户信息管理与客户信息管理。
   - **主要职责**：
     - 用户信息的创建、更新、查询和删除
     - 客户档案管理，包括基本信息、证件信息等

3. **Loan-Service（贷款管理服务）**
   - **功能**：处理贷款相关的业务逻辑。
   - **主要职责**：
     - 贷款申请、审批流程管理
     - 贷款合同生成与管理
     - 贷款发放与还款计划管理

4. **PostLoan-Service（贷后管理服务）**
   - **功能**：处理贷后管理相关的业务逻辑。
   - **主要职责**：
     - 贷后回访任务管理
     - 贷后检查任务管理
     - 催收管理和风险预警
     - 流程化管理贷后检查任务和回访任务的生成与处理

5. **AgricultureLoan-Service（农贷业务管理服务）**
   - **功能**：专门处理农贷业务的管理。
   - **主要职责**：
     - 农贷业务申请、审批
     - 农户年审与评级授信
     - 额度管理与统计分析

6. **PersonalLoan-Service（个贷业务管理服务）**
   - **功能**：专门处理个贷业务的管理。
   - **主要职责**：
     - 个人贷款申请、审批
     - 客户评级授信与额度管理
     - 个人贷款的合同和还款管理

7. **Workflow-Service（工作流服务）**
   - **功能**：集成Flowable，处理所有的工作流管理。
   - **主要职责**：
     - 工作流定义和管理
     - 各业务模块（如Loan-Service, PostLoan-Service）的审批流程管理
     - 工作流实例的启动、暂停、终止与监控

8. **Notification-Service（通知服务）**
   - **功能**：处理系统中的通知与消息。
   - **主要职责**：
     - 短信、邮件、站内消息发送
     - 催收通知、贷后检查通知等

9. **Reporting-Service（报表与统计服务）**
   - **功能**：提供报表生成与统计分析功能。
   - **主要职责**：
     - 贷款、贷后管理的统计报表生成
     - 用户行为统计
     - 数据导出与图表展示

10. **Gateway-Service（API网关服务）**
    - **功能**：作为微服务的统一入口，处理请求路由与负载均衡。
    - **主要职责**：
      - 路由转发与API聚合
      - 鉴权与限流
      - 统一的错误处理

11. **Config-Service（配置中心服务）**
    - **功能**：统一管理微服务的配置。
    - **主要职责**：
      - 集中化配置管理
      - 配置动态刷新

### 流程与服务交互说明

- **Flowable在微服务中的应用**：`Workflow-Service`模块将作为独立的工作流引擎，通过REST API与其他微服务（如`Loan-Service`, `PostLoan-Service`）进行交互，以管理业务流程的启动、审批和完成。每个涉及工作流的业务操作将在相应的业务服务中调用`Workflow-Service`来启动或参与相应的流程。

- **松耦合性保证**：各微服务通过API网关(`Gateway-Service`)进行统一的访问和管理，内部通过REST API或消息队列（如RabbitMQ）进行通信，保证服务间的低耦合和高可维护性。

- **模块独立性**：每个服务模块独立开发和部署，便于分工协作与后期维护。各模块之间通过接口进行通信，变更一个模块不需要修改其他模块，保证系统的稳定性与可扩展性。
