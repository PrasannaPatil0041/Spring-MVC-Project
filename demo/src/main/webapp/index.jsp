<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to Prasanna's Site</title>
    <style>
        /* Reset & base */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        html, body {
            height: 100%;
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
            color: #ffffff;
            overflow-x: hidden;
            animation: fadeInBody 1.2s ease-in-out;
        }

        @keyframes fadeInBody {
            from { opacity: 0; transform: scale(0.98); }
            to { opacity: 1; transform: scale(1); }
        }

        /* Navigation */
        nav {
            background-color: rgba(0, 77, 64, 0.9);
            padding: 15px 30px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.4);
        }

        nav .logo {
            font-size: 26px;
            font-weight: bold;
            color: #00ffcc;
            text-shadow: 0 0 6px rgba(0,255,204,0.6);
        }

        nav ul {
            list-style: none;
            display: flex;
            gap: 25px;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
            font-size: 16px;
            padding: 8px 14px;
            border-radius: 8px;
            transition: all 0.3s ease;
        }

        nav ul li a:hover {
            background-color: #00ffcc;
            color: #00332f;
            box-shadow: 0 0 10px #00ffcc;
        }

        /* Main content */
        .content {
            max-width: 800px;
            margin: 120px auto;
            padding: 40px;
            text-align: center;
            background: rgba(255, 255, 255, 0.05);
            backdrop-filter: blur(6px);
            border-radius: 20px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.5);
            animation: slideUp 1s ease;
        }

        .content h1 {
            font-size: 48px;
            margin-bottom: 20px;
            text-shadow: 2px 2px 10px #00ffcc;
        }

        .content p {
            font-size: 20px;
            line-height: 1.6;
            color: #e0f2f1;
        }

        @keyframes slideUp {
            from { transform: translateY(40px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }

        footer {
            text-align: center;
            margin-top: 60px;
            padding: 20px;
            font-size: 14px;
            color: #bbbbbb;
        }
    </style>
</head>
<body>

    <nav>
        <div class="logo">Prasanna's Portal</div>
        <ul>
            <li><a href="/demo/home">Home</a></li>
            <li><a href="/demo/about">About</a></li>
            <li><a href="/demo/feedback">Feedback</a></li>
            <li><a href="/demo/contact">Contact Us</a></li>
        </ul>
    </nav>

    <div class="content">
        <h1>Welcome to My Website</h1>
        <p>
            I’m <strong>Prasanna Patil</strong>, a Java Developer and Blockchain Enthusiast.  
            Explore the site to learn more about my journey, register for updates,  
            or connect for exciting collaborations and real-world projects!
        </p>
    </div>

    <footer>
        &copy; 2025 Prasanna Patil • All rights reserved.
    </footer>

</body>
</html>
