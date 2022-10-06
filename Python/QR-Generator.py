# Install these libraries before running it on your local machine
#pip install pyqrcode
#pip install pypng
import pyqrcode
import png
from pyqrcode import QRCode


# String whose QR is to be Generated
s = "This Counts as My Second Hacktober Pull Request"

# Generate QR code
url = pyqrcode.create(s)

#For Creating the file in .svg format"
url.svg("generated-qr.svg", scale = 8)

# For Creating the .png file of the QR-Code"
url.png('generated-qr.png', scale = 6)
