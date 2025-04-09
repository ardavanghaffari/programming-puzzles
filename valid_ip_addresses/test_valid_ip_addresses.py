import unittest
from valid_ip_addresses import valid_ip_addresses

params = [
    ("", []),
    ("123", []),
    ("000256", []),
    ("256256256256", []),
    ("1234567890123", []),
    ("0000", ["0.0.0.0"]),
    ("1111", ["1.1.1.1"]),
    ("010010",
        ["0.10.0.10",
         "0.100.1.0"]),
    ("25525511135",
        ["255.255.11.135",
         "255.255.111.35"]),
    ("101023",
        ["1.0.10.23",
         "1.0.102.3",
         "10.1.0.23",
         "10.10.2.3",
         "101.0.2.3"]),
    ("1921680",
        ["1.9.216.80",
         "1.92.16.80",
         "1.92.168.0",
         "19.2.16.80",
         "19.2.168.0",
         "19.21.6.80",
         "19.21.68.0",
         "19.216.8.0",
         "192.1.6.80",
         "192.1.68.0",
         "192.16.8.0"]),
]


class TestValidIpAddresses(unittest.TestCase):
    def test_valid_ip_addresses(self):
        for input_string, expected_ip_addresses in params:
            with self.subTest(string=input_string, expected=expected_ip_addresses):
                self.assertEqual(valid_ip_addresses(input_string), expected_ip_addresses)


if __name__ == "__main__":
    unittest.main()
