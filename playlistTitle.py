import pytesseract
from PIL import Image

# Update the path below if your image is named differently
image_path = r'C:\Users\basuk\Desktop\OOP in java (telusko)\telusko playlist image.png'
image = Image.open(image_path)

# Extract text using OCR
text = pytesseract.image_to_string(image)

# Split and filter lines to get likely video titles
lines = [line.strip() for line in text.split('\n') if line.strip()]
titles = [line for line in lines if len(line) > 3 and not line.isdigit()]

for idx, title in enumerate(titles, 1):
    print(f"{idx}. {title}")
