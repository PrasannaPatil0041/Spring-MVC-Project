<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #ece9e6, #ffffff);
            margin: 0;
            padding: 0;
        }

        form {
            width: 400px;
            margin: 60px auto;
            padding: 30px;
            background: linear-gradient(145deg, #ffffff, #f0f0f0);
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease;
        }

        form:hover {
            transform: scale(1.01);
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        label {
            font-weight: 600;
            display: block;
            margin-bottom: 5px;
            color: #555;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="password"],
        textarea {
            width: 100%;
            padding: 12px;
            margin-bottom: 18px;
            border: 1px solid #ccc;
            border-radius: 8px;
            background-color: #f9f9f9;
            font-size: 14px;
            transition: border-color 0.3s ease;
        }

        input:focus,
        textarea:focus {
            outline: none;
            border-color: #4a90e2;
            background-color: #fff;
        }

        .gender-group {
            margin-bottom: 18px;
        }

        .gender-group label {
            font-weight: 500;
            margin-right: 15px;
        }

        input[type="radio"] {
            margin-right: 5px;
        }

        input[type="submit"] {
            background-color: #4a90e2;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
            font-weight: bold;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #3b7dc3;
        }

        @media (max-width: 480px) {
            form {
                width: 90%;
                padding: 20px;
            }
        }
    </style>
</head>
<body>

<form action="register" method="post">
    <h2>Registration Form</h2>

    <label for="name">Full Name:</label>
    <input type="text" id="name" name="name" required>

    <label for="phone">Phone Number:</label>
    <input type="tel" id="phone" name="phone" required pattern="[0-9]{10}" title="Enter 10-digit phone number">

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>

    <label for="address">Address:</label>
    <textarea id="address" name="address" rows="3" required></textarea>

    <label>Gender:</label>
    <div class="gender-group">
        <input type="radio" id="male" name="gender" value="Male" required>
        <label for="male">Male</label>

        <input type="radio" id="female" name="gender" value="Female">
        <label for="female">Female</label>

        <input type="radio" id="other" name="gender" value="Other">
        <label for="other">Other</label>
    </div>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>

    <input type="submit" value="Register">
</form>

</body>
</html>
