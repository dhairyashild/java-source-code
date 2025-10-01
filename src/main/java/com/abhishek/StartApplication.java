package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@Controller
public class StartApplication {

    private static final Logger logger = LoggerFactory.getLogger(StartApplication.class);

    @GetMapping("/")
    public String index(final Model model) {
        logger.info("Accessed / endpoint");
        model.addAttribute("title", "🚀 SpringBoot WebApp on AWS EKS - By DHAIRYASHIL DESAI 🚀");
        
        // DevOps Tools & Services Information with emojis
        model.addAttribute("devopsTitle", "🛠️ DevOps Stack Powering This Application:");
        model.addAttribute("services", new String[]{
            "🔷 Jenkins (CI/CD Pipeline)",
            "🟠 Maven (Build Automation)", 
            "🔵 SonarQube (Code Quality)",
            "🐳 Docker (Containerization)",
            "📦 Amazon ECR (Container Registry)",
            "⚙️ Kubernetes (K8s Orchestration)",
            "☁️ Amazon EKS (Managed K8s)",
            "📊 AWS CloudWatch (Monitoring & Logs)",
            "🔐 AWS IAM (Access Management)",
            "🛡️ AWS WAF (Web Application Firewall)"
        });
        
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
