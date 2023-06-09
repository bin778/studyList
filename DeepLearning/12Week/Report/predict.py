import torch
import torch.nn as nn

import sys
import numpy as np
import matplotlib.pyplot as plt

# model과 utils는 사용자가 직접 정의한 외부 모듈을 참조한다.
from model import ImageClassifier

from utils import load_mnist
from utils import split_data
from utils import get_hidden_sizes

# 학습에 사용할 손글씨 이미지셋 모델
model_fn = "./model.pth"

# 사용할 장치를 선택한다(CPU 사용).
device = torch.device('cpu')
def load(fn, device):
    d = torch.load(fn, map_location=device)
    
    return d['model'], d['config']
print(device)

# 손글씨 이미지셋 모델을 시각화한다.
def plot(x, y_hat):
    for i in range(x.size(0)):
        img = (np.array(x[i].detach().cpu(), dtype='float')).reshape(28,28)

        plt.imshow(img, cmap='gray')
        plt.show()
        print("Predict:", float(torch.argmax(y_hat[i], dim=-1)))

# 손글씨 이미지셋 모델을 eval() 함수를 사용해 모델을 추론한다.
def test(model, x, y, to_be_shown=True):
    model.eval()
    
    with torch.no_grad():
        y_hat = model(x)

        correct_cnt = (y.squeeze() == torch.argmax(y_hat, dim=-1)).sum()
        total_cnt = float(x.size(0))
        
        accuracy = correct_cnt / total_cnt
        print("Accuracy: %.4f" % accuracy)
        
        if to_be_shown:
            plot(x, y_hat)

# 손글씨 이미지셋 모델을 로딩한다.
model_dict, train_config = load(model_fn, device)

# MNIST 테스트 모델을 로딩한다.
x, y = load_mnist(is_train=False)
x, y = x.to(device), y.to(device)

# MNIST 테스트 모델 크기 지정
input_size = int(x.shape[-1])
output_size = int(max(y)) + 1

# ImageClassifier 함수에 MNIST 테스트 모델 할당
model = ImageClassifier(
    input_size=input_size,
    output_size=output_size,
    hidden_sizes=get_hidden_sizes(input_size,output_size,train_config.n_layers),
    use_batch_norm=not train_config.use_dropout,
    dropout_p=train_config.dropout_p,
).to(device)

# 임의로 초기화된 가중치 파라미터 값을
# 학습이 완료된 기존의 파라미터 값으로 바꿔치기
model.load_state_dict(model_dict)

# MNIST 테스트 모델에 대한 정확도 측정
test(model, x, y, to_be_shown=False)

# 결과값 출력
n_test = 20
test(model, x[:n_test], y[:n_test], to_be_shown=True)