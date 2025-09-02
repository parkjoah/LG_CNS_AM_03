import styled from "styled-components";

const StyledTextarea = styled.textarea`
  width: calc(100% - 32px);
  ${(props) =>
    props.height &&
    `
height: ${props.height}px;
`}
  padding: 16px;
  font-size: 16px;
  line-height: 20px;
  margin-bottom: 16px;
`;

export const TextArea = ({ height, value, changeHandler }) => {
  return (
    <StyledTextarea height={height} value={value} onChange={changeHandler} />
  );
};
